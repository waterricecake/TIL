n = int(input())
plan  = input().split()

x, y = 1 ,1

#for i in plan:
#    if i =="R":
#        x_t = x
#        y_t = y+1
#    elif i == "L":
#        x_t = x
#        y_t = y-1
#    elif i =="U":
#        x_t = x-1
#        y_t = y
#    elif i == "D":
#        x_t = x+1
#        y_t = y
#    if 0<x_t<n and 0<y_t<n:
#        x = x_t
#        y= y_t
dx = [0,0,-1,1]
dy = [-1,1,0,0]
type = ['L','R','U','D']

for p in plan:
    for i in range(4):
        if p == type[i]:
            x_t = x + dx[i]
            y_t = y + dy[i]
    if 0<x_t<n and 0<y_t<n:
        x = x_t
        y = y_t
print(x, y)
