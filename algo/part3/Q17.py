import sys

n, k = [int(x) for x in sys.stdin.readline().split()]
data = []
for _ in range(n):
    data.append([int(x) for x in sys.stdin.readline().split()])
temp = [[0] * n for _ in range(n)]
s,x,y = [int(x) for x in sys.stdin.readline().split()]
dx = [1,0,-1,0]
dy = [0,1,0,-1]

def virus(num):
    for i in range(n):
        for j in range(n):
            temp[i][j] = data[i][j]
    for i in range(n):
        for j in range(n):
            if temp[i][j] == num:
                for c in range(4):
                    ni = i + dx[c]
                    nj = j + dy[c]
                    if 0<=ni<n and 0<=nj<n:
                        if temp[ni][nj] == 0:
                            data[ni][nj] = num
    
for _ in range(s):
    for i in range(k):
        virus(i+1)

print(data[x-1][y-1])