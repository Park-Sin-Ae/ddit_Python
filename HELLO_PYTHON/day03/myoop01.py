class Animal :
    def __init__(self):
        self.flagM = True
        print("생성자")
        
    def goToThai(self):
        self.flagM = not self.flagM
        
    def __del__(self):
        print("소멸자")

if __name__ == '__main__' :   
    ani = Animal()
    print("flagM", ani.flagM)
    ani.goToThai()
    print("flagM", ani.flagM)
