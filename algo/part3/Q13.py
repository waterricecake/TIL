from itertools import combinations
n , m = map(int, input().split())

array = []
chicken = []
home = []
for i in range(n):
    a = list(map(int, input().split()))
    j = 0
    for k in a:
        if k == 1:
            home.append([i+1,j+1])
        elif k == 2:
            chicken.append([i+1,j+1])
        j += 1

def chickdisfunc(home,chicken):
    chickdis = []
    for x,y in home:
        min_ = []
        for x_,y_ in chicken:
            r = abs(x-x_) + abs(y-y_)
            min_.append(r)
        chickdis.append(min(min_))
    return sum(chickdis)

newchickda = list(combinations(chicken,m))
result = 100000000
for i in newchickda:
    a = chickdisfunc(home,i)
    if a < result:
        result = a

print(result)