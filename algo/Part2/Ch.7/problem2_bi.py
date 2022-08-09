def binary_search(array, target, start, end):
    if start > end:
        print("No", end = " ")
        return None
    mid = (start + end) // 2
    if array[mid] == target:
        print("yes", end = " ")
        return mid
    elif array[mid] > target:
        return binary_search(array, target, start, mid - 1)
    else:
        return binary_search(array, target, mid +1, end)

n = int(input())
array = list(map(int, input().split()))

m = int(input())
array_f = list(map(int, input().split()))

for i in array_f:
    binary_search(array, i, 0, n-1)