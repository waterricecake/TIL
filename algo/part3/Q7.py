n = input()

num = len(n)//2
d = []
for i in range(len(n)):
    d.append(int(n[i]))


left = sum(d[:num])
right = sum(d[num:])

if left == right:
    print("LUCKY")
else:
    print("READY")