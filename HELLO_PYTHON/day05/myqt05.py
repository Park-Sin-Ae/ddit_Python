import sys
from PyQt5 import uic
from PyQt5.Qt import QMainWindow, QApplication
from random import random

form_class = uic.loadUiType("myqt05.ui")[0]

class WindowClass(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)
    
    def myclick(self):
        arr = list(range(1, 45+1))
# arr = [1,2,3,4,5,6,7,8,9]

        for i in range(1000) :
            rnd = int(random()*45)
            a = arr[0]
            arr[0] = arr[rnd]
            arr[rnd] = a
            
        for i in range(6) :
            for j in range(6) :
                if arr[i] < arr[j] :
                    a = arr[i]
                    b = arr[j]
                    arr[i] = b
                    arr[j] = a
                    
                    
        self.lcd1.display(str(arr[0]))
        self.lcd2.display(str(arr[1]))
        self.lcd3.display(str(arr[2]))
        self.lcd4.display(str(arr[3]))
        self.lcd5.display(str(arr[4]))
        self.lcd6.display(str(arr[5]))
        
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = WindowClass()
    myWindow.show()
    sys.exit(app.exec_())
