n,m,k = map(int, input().split())
data = list(map(int,input().split()))
result = 0
data.sort()
most1 = data[n-1]
most2 = data[n-2]

if most1 == most2:
    print(m*most1)
else:
    print(((m//k)*most1*k)+(m%k)*most2)