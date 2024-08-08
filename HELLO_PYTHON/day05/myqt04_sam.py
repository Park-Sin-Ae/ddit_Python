import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication

form_class = uic.loadUiType("myqt04.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
    
    def myclick(self):
        a = self.le01.text()
        b = self.le02.text()
        c = self.le03.text()
        
        aa = int(a)
        bb = int(b)
        cc = int(c)
       
        sum = 0
        for i in range(aa, bb + 1) :
            if i % cc == 0 :
                sum += i
                
            print(sum)
            self.le04.setText(str(sum))
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    sys.exit(app.exec_())
