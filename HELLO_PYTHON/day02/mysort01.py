arr = [3, 2, 1]

for i in range(3) :
    for j in range(3) :
        if arr[i] < arr[j] :
            a = arr[i]
            b = arr[j]
            arr[i] = b
            arr[j] = a
            
print(arr)