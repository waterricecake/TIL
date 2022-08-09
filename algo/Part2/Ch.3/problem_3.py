n, m = map(int, input().split())

array = []
for _ in range(n):
    b = list(map(int,input().split()))
    b.sort()
    array.append(b)

most = 0
for i in array:
    if i[0]>most:
        most = i[0]

print(most)
