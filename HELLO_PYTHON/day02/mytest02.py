# 가위/바위/보를 입력하시오 : 가위
# 나 : 가위
# 컴 : 보
# 결과 : 이김
from random import random

mine = ""
com = ""
result = ""

rnd = random()

if rnd > 0.66 :
    com = "가위"
elif rnd > 0.33 :
    com = "바위"
else :
    com = "보"


mine = input("가위/바위/보를 입력하세요")

if com == mine :  
    result = "비겼습니다."
elif (com == "가위" and mine == "보") or (com == "바위" and mine == "가위") or (com == "보" and mine == "바위") :
    result = "당신이 졌습니다."
else :
    result = "당신이 이겼습니다."
    
print("나 : " , mine)
print("컴 : " , com)
print("결과 : " , result)

print("나:{}".format(mine)) 
print("컴:{}".format(com))
print("결과:{}".format(result))
