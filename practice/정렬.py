data = [7, 8, 9 , 10,5,5,6,1,3,7,4]

for i in range(len(data)):
    a = data[i]
    a_p = i
    for j in range(i+1,len(data)):
        if data[j] < a:
            a = data[j]
            a_p = j
        if data[i] != a:
            data[a_p] = data[i]
            data[i] = a
print(data)