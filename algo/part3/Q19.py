from itertools import permutations
n = int(input())
arr = list(map(int,input().split()))
data = list(map(int,input().split()))
c = []
for _ in range(data[0]): c.append("+")
for _ in range(data[1]): c.append("-")
for _ in range(data[2]): c.append("*")
for _ in range(data[3]): c.append("/")
max_ = -1e9
min_ = 1e9
for case in list(permutations(c,len(c))):
    sum = arr[0]
    for i in range(len(case)):
        if case[i] == "+":
            sum += arr[i+1]
        elif case[i] == "-":
            sum -= arr[i+1]
        elif case[i] == "*":
            sum *= arr[i+1]
        elif case[i] == "/":
            sum = int(sum/arr[i+1])
    max_ = max(max_,sum)
    min_ = min(min_,sum)
print(max_)
print(min_)