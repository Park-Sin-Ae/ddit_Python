from random import random
arr = list(range(1, 9+1))
# arr = [1,2,3,4,5,6,7,8,9]

for i in range(100) :
    rnd = int(random()*9)
    a = arr[0]
    arr[0] = arr[rnd]
    arr[rnd] = a
    

print(arr[0])
print(arr[1])
print(arr[2])
