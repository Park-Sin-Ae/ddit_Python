import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication
from cgitb import text

form_class = uic.loadUiType("myqt04.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
    
    def myclick(self):
        le01 = (int)(self.le01.text())
        le02 = (int)(self.le02.text())
        le03 = (int)(self.le03.text())
        
        res = 0;
        
        
        for i in range(le01,le02 + 1):
            if i % le03 == 0 :
                res += i
            self.le04.setText(str(res))
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    sys.exit(app.exec_())
