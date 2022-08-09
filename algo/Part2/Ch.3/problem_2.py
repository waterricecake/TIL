n, m ,k = map(int, input().split())

array = list(map(int, input().split()))

array.sort()

result = (m//k)*k*array[n-1] + (m%k)*array[n-2]
print(result)