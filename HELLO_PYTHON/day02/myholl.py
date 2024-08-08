# 홀/짝을 입력하세요 홀
# 나 : 홀
# 컴 : 짝
# 결과 : 짐
# from random import random
#
# com = "홀" if random() < 0.5 else "짝"
# mine = input("홀/짝을 입력하세요")
# result = "이김" if mine == com else "짐"
#
# print("나 : ",  mine)
# print("컴 : ",  com)
# print("결과 : ",  result)


# 선생님 풀이

from random import random

com = ""
mine = ""
result = ""

rnd = random()

if rnd > 0.5 :
    com = "홀"
else : 
    com = "짝"
    
mine = input("홀/짝을 입력하세요")

if com == mine :
    result = "이김"
else :
    result = "짐"

print("나 : ",  mine)
print("컴 : ",  com)
print("결과 : ",  result)
    
    