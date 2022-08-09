from collections import deque
def sollution(n, k, test, l, array):
    ma = [[0 for _ in range(n)] for __ in range(n)]
    for i in test:
        ma[i[0]-1][i[1]-1] = 1
    sneak = deque()
    sneak.append([0,0])
    x= sneak[0][0]
    y= sneak[0][0]
    head = 0
    dx = [1,0,-1,0]
    dy = [0,-1,0,1]
    count = 0
    while True:
        for i in array:
            if count == i[0]:
                if i[1] == "L":
                    head +=1
                else:
                    head -= 1
            if head >3:
                head = 0
            elif head < 0:
                head = 3
        x_f = x + dx[head]
        y_f = y + dy[head]
        if 0<=x_f<=len(ma)-1 and 0<=y_f<=len(ma)-1 and [x_f,y_f] not in sneak:
            sneak.append([x_f,y_f])
            if ma[y_f][x_f] == 0:
                sneak.popleft()
            else:
                ma[y_f][x_f] = 0
            x = sneak[len(sneak)-1][0]
            y = sneak[len(sneak)-1][1]
        else:
            break
        count +=1
    return count+1
n =  int(input())               
k = int(input())               
test = []
for _ in range(k):
    x,y = map(int, input().split())
    test.append([x,y])
l = int(input())
array= []
for _ in range(l):
    x, c = input().split()
    array.append([int(x),c])  
print(sollution(n, k, test, l, array))