
class LeeJY():
    def __init__(self):
        self.money = 100;
    
    def yakun(self):
        self.money += 1
    
class ElonMask():
    def __init__(self):
        self.skill_gas = 10000;
    
    def getPenalty(self, cnt):
        self.skill_gas -= cnt
      
      
class Sinae(LeeJY, ElonMask) :
    def __init__(self) :
        LeeJY.__init__(self)
        ElonMask.__init__(self)

        
if __name__ == '__main__':
    thug = LeeJY() 
    print("샘성", thug.money)
    thug = ElonMask()
    print("테슬라", thug.skill_gas)


if __name__ == '__main__':
    thug = Sinae()
    
    print("부자얌", thug.money)
    print("가스라이팅천재얌", thug.skill_gas)
    
    
    
        