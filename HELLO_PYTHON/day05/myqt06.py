import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication

form_class = uic.loadUiType("myqt06.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        
    def myclick(self):
        dan = self.le.text()
        idan = int(dan)
        
        txt = ""
        
        for i in range(1, 9+1) :
            txt += "{} x {} = {}\n".format(dan,i,i*idan)
            
        self.te.setText(txt)
            
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()


