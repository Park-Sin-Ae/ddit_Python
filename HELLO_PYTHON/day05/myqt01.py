import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication

form_class = uic.loadUiType("myqt01.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        # self.setupUi(self)
        
    def myclick(self):
        self.lbl.setText("Good Evening")
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()


