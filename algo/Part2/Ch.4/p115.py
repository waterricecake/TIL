p = input()

x, y = ord(p[0]) , int(p[1])

data = [1,-1,2,-2]
d = []
for i in data:
    for j in data:
        if i*i !=j*j:
            if (ord('a')<=(x+i)<=ord('h')) and (0<(y+j)<9):
                d.append([x+i,y+j])
print(len(d))