s = input()
result = []
n = 0
for i in s:
    if 65 <= ord(i) and ord(i)<=90:
        result.append(i)
    else:
        n += int(i)
result.sort()
result.append(n)

for i in result:
    print(i,end="")