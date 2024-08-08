# 좋아하는 수를 입력하세요 6
# 좋아하는 수를 입력하세요 7
# 6과 7의 합은 13입니다.

a = input("좋아하는 수를 입력하세요")
b = input("또 좋아하는 수를 입력하세요")

# aa = int(a)
# bb = int(b)
# sum = aa + bb
#
# print(a + "과" + b + "의 합은" + str(sum) + "입니다.")

print("a", a, "b", b)
print(a,"와", b,"의 합은", int(a)+int(b), "입니다")

print("{}과 {}의 합은 {}입니다.".format(a,b,int(a)+int(b)))