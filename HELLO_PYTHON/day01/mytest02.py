# 첫수를 입력하세요 1 5 8  
# 끝수를 입력하세요 3 3 8

# 1은 3보다 작다.
# 5는 3 보다 크다
# 8과 8은 같다.

a = input("첫수를 입력하세요")
b = input("끝수를 입력하세요")

if a < b :
    print("{}는 {}보다 작다".format(a,b))
elif a > b :
    print("{}는 {}보다 크다".format(a,b))
else :
    print("{}는 {}과 같다".format(a,b))
    
# 선생님 풀이
