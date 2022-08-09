n = 5
count = 0

h,m,s = 0,0, 0
while h < n+1:
    s +=1
    if s ==60:
        m +=1
        s = 0
        if m == 60:
            h +=1
            m =0
    if "3" in str(h) + str(m) + str(s):
        count +=1

print(count)

count = 0
for i in range(n+1):
    for j in range(60):
        for k in range(60):
            if "3" in str(i) + str(j) + str(k):
                count +=1
print(count)