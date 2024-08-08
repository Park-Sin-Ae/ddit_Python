from random import random

def getHJ():
    rnd = random()
    if rnd > 0.5 :
        com = ("홀")
    else :
        com = ("짝")
        
    return com
    

com = getHJ()
print("com", com)