import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication
from random import random

form_class = uic.loadUiType("myqt07.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
        
    def myclick(self):
        mine = self.pte_mine.toPlainText()
        com = self.pte_com.toPlainText()
        
        result = ""
        rnd = random()
        
        if rnd > 0.66 :
            com = "가위"
        elif rnd > 0.33 :
            com = "바위"
        else : 
            com = "보"
            
        if com == mine :
            result = "비겼습니다"
        elif (com == "가위" and mine == "보") or (com == "바위" and mine == "가위") or (com == "보" and mine == "바위") :
            result = "패"
        else :
            result = "승"
            
            
        self.pte_com.clear()
        self.pte_result.clear()
            
        self.pte_com.appendPlainText(com)
        self.pte_result.appendPlainText(result)
            
            
        
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    app.exec_()


