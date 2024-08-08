# 1-99 업앤다운게임
from random import random

com = int(random() * 99) + 1


for i in range(10) :
    mine = int(input("수를 입력하시오"))
    
    if com == mine :
        print(mine, "정답!")
        break
    elif com < mine : 
        print(mine, "DOWN")
    else :
        print(mine, "UP")
    
    if i == 9 :
        print("기회를 모두 소진하였습니다. 정답은", com , "입니다")
        
        
# 선생님 풀이
# com = int(random()*99) + 1
# print("com :" , com)
#
# flag_ans = False
# for i in range(2) :
#     mine = input("수를 맞춰보세요")  
#     imine = int(mine)
#     if com > imine :
#         print("{} UP".format(mine))
#     elif com < imine :
#         print("{} DW".format(mine))
#     else :
#         print("{} 정답".format(mine))
#         flag_ans = True
#         break
#
# if not flag_ans :
#     print("똑바로 하세요")
        
