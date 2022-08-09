n = int(input())
array = list(map(int, input().split()))

m = int(input())
array_f = list(map(int, input().split()))

for i in array_f:
    c = 0
    for j in array:
        if i == j:
            print("yes", end=" ")
            c = 1
    if c == 0:
        print("no", end = " ")