n,m =  map(int,input().split())
d = [[0]*m for _ in range(n)]
x,y,f =map(int,input().split())
array =[]
for i in range(n):
    array.append(list(map(int,input().split())))

dx = [-1,0,1,0]
dy = [0,1,0,-1]

def turn_left():
    global f
    f -=1
    if f == -1:
        f = 3

count = 0
turntime = 0

while True:
    turn_left()
    nx = x + dx[f]
    ny = y + dy[f]

    if d[nx][ny] == 0 and array[nx][ny] ==0:
        d[nx][ny] = 1
        x = nx
        y = ny
        count += 1
        turntime = 0
        continue
    else:
        turntime +=1
    if turntime == 4:
        nx = x - dx[f]
        ny = y -dy[f]

        if array[nx][ny]==0:
            x = nx
            y = ny
        else:
            break
        turntime = 0
print(count)
print(d)
print(array)