n = int(input())
array = list(map(int, input().split()))

m = int(input())
array_f = list(map(int, input().split()))

for i in array_f:
    if i in array:
        print("yes", end=" ")
    else:
        print("no", end = " ")