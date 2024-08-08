from random import random
arr = list(range(1, 45+1))
# arr = [1,2,3,4,5,6,7,8,9]

for i in range(1000) :
    rnd = int(random()*45)
    a = arr[0]
    arr[0] = arr[rnd]
    arr[rnd] = a
    
for i in range(6) :
    for j in range(6) :
        if arr[i] < arr[j] :
            a = arr[i]
            b = arr[j]
            arr[i] = b
            arr[j] = a
    

# print(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5])
print(arr[0], end=",")
print(arr[1], end=",")
print(arr[2], end=",")
print(arr[3], end=",")
print(arr[4], end=",")
print(arr[5])
