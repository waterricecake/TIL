from collections import deque

def sollution(n, k, test, l, array):
    ma = [[0 for _ in range(n)] for __ in range(n)]
    for i in test:
        ma[i[1]-1][i[0]-1] = 1
    sneak = deque()
    sneak.append([0,0])
    x= sneak[0][0]
    y= sneak[0][0]
    head = 0
    dx = [1,0,-1,0]
    dy = [0,-1,0,1]
    for i in ma:
        print(i)
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
        if [x_f,y_f] in sneak:
            print("꼬리만남",sneak,"(",x_f,",",y_f,")",x,y)
            break
        if 0<=x_f<=len(ma)-1 and 0<=y_f<=len(ma)-1:
            sneak.append([x_f,y_f])
            if ma[y_f][x_f] == 0:
                sneak.popleft()
            else:
                ma[y_f][x_f] = 0
            x = sneak[len(sneak)-1][0]
            y = sneak[len(sneak)-1][1]
        else:
            print("장외",sneak,"(",x_f,",",y_f,")",x,y)
            break
        count +=1
        print(count,sneak,"(",x_f,",",y_f,")",x,y)
    return count+1

test = [[3,4],[2,5],[5,3]]
array = [[3,"D"],[15,"L"],[17,"D"]]
print(sollution(6,3,test, 3, array))

test = [[1,2],[1,3],[1,4],[1,5]]
array = [[8,"D"],[10,"D"],[11,"D"],[13,"L"]]
print(sollution(10,4,test, 4, array))

test = [[1,5],[1,3],[1,2],[1,7]]
array = [[8,"D"],[10,"D"],[11,"D"],[13,"L"]]
print(sollution(10,4,test, 4, array))



#n =  int(input())
                
#k = int(input())
                
#test = []
#for _ in range(k):
#    x,y = map(int, input().split())
#    test.append([x,y])
#l = int(input())
#array= []
#for _ in range(l):
#    x, c = input().split()
#    array.append([int(x),c])
        
#print(sollution(n, k, test, l, array))