n , m = map(int, input().split())

array = list(map(int, input().split()))
data = []
for i in range(n-1):
    for j in range(i+1, n):
        if array[i] != array[j]:
            data.append([array[i],array[j]])
print(len(data))