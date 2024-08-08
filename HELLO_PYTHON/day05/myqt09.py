import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication, QMessageBox
from random import random

form_class = uic.loadUiType("myqt09.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        self.com = -1
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        self.ranCom()
        
    def ranCom(self):
        self.com = int(random()*99)+1
        print("com", self.com)
        
    def myclick(self):
        mine = self.le.text()
        imine = int(mine)
        
        line = ""
        if self.com < imine :
            line = mine + "\t" + "DW" + "\n"
        elif self.com > imine :
            line = mine + "\t" + "UP" + "\n"
        else :
            line = mine + "\t" + "정답" + "\n"
            QMessageBox.about(self, "업다운게임", line )
            
        str_old = self.te.toPlainText()
        self.te.setText(str_old + line)
        self.le.setText("")
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()


