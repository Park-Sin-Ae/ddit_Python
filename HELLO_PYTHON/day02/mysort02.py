arr = [18,32,19,12,6,27]

for i in range(6) :
    for j in range(6) :
        if arr[i] < arr[j] :
            a = arr[i]
            b = arr[j]
            arr[i] = b
            arr[j] = a
            
print(arr)

# (n2-n)/2