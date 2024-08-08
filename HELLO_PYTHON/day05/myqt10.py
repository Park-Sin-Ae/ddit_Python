import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication

form_class = uic.loadUiType("myqt10.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.star()
            
    def star(self):
        ret = ""
        cnt = 4
        for i in range(2,cnt+1) :
            ret += "★"*i +"\n"
        print(ret)
        
    def myclick(self):
        str = self.le_first.text()
        stri = int(str)
        
        end = self.le_last.text()
        endi = int(end)
        
        print(endi)
        
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()


