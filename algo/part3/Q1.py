n = int(input())
result = []
array = list(map(int, input().split()))

array.sort()

while array:
    now_data = array[n-1]
    if now_data <= len(array):
        array.pop(n-1)
        n = len(array)
        d = []
        d.append(now_data)
        for i in range(now_data-1):
            d.append(array[n-1])
            array.pop(n-1)
            n = len(array)
        result.append(d)
    else:
        break
print(len(result))