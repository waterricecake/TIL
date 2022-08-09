n , m = map(int, input().split())
data = []

#for i in range(n):
#    s = list(map(int,input().split()))
#    data.append(s)
#small= list(range(n))
#for i in range(0,n):
#    small[i] = data[i][0]
#    for j in range(0,m):
#        if data[i][j] <small[i]:
#            small[i] = data[i][j]
#print(small)
#small.sort()
#print(small[n-1])

small= list(range(n))
for i in range(n):
    s = list(map(int,input().split()))
    small[i] = s[0]
    for j in range(m):
        if s[j] < small[i]:
            small[i] = s[j]
print(small)
small.sort()
print(small[n-1])