n, m = map(int, input().split())

d = []
for i in range(n):
    d.append(0)

array = []
for i in range(2):
    s = list(map(int, input().split()))
    s.sort()
    array.append(s)

for i in range(m):
    for j in range(n):
        if d[j] ==0:
            if array[0][j] < array[1][n-i-1]:
                array[0][j], array[1][n-i-1] = array[1][n-i-1],array[0][j]
                d[j] = 1
result = 0
for i in array[0]:
    result += i
print(result)