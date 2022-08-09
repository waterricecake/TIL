n = input()
 
result = [0,0]
data = []
d= []
d.append(n[0])
for i in range(1, len(n)):

    if n[i] == n[i-1]:
        d.append(n[i])
    else:
        data.append(d)
        d = []
        d.append(n[i])
    if i == len(n)-1:
        data.append(d)


for i in data:
    if "0" in i:
        result[0] +=1
    else:
        result[1] += 1
print(min(result[0],result[1]))