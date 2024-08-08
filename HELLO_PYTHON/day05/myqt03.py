import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication
from cgitb import text

form_class = uic.loadUiType("myqt03.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
    
    def myclick(self):
        le01 = self.le01.text()
        le02 = self.le02.text()
        
        minus = int(le01)-int(le02)
        res = str(minus)
        self.le03.setText(res)
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    sys.exit(app.exec_())
