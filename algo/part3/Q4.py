n = int(input())

data = list(map(int,input().split()))

data.sort()

array = []

num = 2**n

for i in range(num):
    result = 0
    t = format(i, "b").zfill(n)
    t = str(t)
    for k in range(len(t)):
        if t[k] == "1":
            result += data[k]
    if result not in array:
        array.append(result)
array.sort()

for i in range(1,len(array)):
    now = array[i] - array[i-1]
    if now != 1:
        print(array[i-1]+1)
        break