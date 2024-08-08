from day03.myoop01 import Animal

class Human(Animal) :
    def __init__(self):
        super().__init__()
        self.skill_communication = 1
    
    def momstouch(self, stroke):
        self.skill_communication += stroke
        
if __name__ == '__main__' :
    hu = Human()
    
    print("flagM : ", hu.flagM)
    print("SC : ",hu.skill_communication)
    hu.momstouch(5)
    hu.goToThai()
    print("flagM : ", hu.flagM)
    print("SC : ",hu.skill_communication)
        