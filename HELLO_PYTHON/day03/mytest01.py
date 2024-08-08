# 첫 별수를 입력하세요 3
# 끝 별수를 입력하시오 5
# ★★★
# ★★★★
# ★★★★★
a = int(input("첫 별수를 입력하세요"))
b = int(input("끝 별수를 입력하세요"))

# i = 0
# while True :
#     i += a
#     if i < b :
#         print("★" * i)

# 선생님 풀이
def star(cnt):
    ret = ""
    for i in range(cnt):
        ret += "★"
    return ret

for i in range(a, b + 1) :
    print(star(i))
