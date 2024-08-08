import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication

form_class = uic.loadUiType("myqt02.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
    
    def myclick(self):
        txt = self.le.text()
        num = int(txt)
        txt2 = str(num-1)
        # num -= 1
        self.le.setText(txt2)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    sys.exit(app.exec_())
