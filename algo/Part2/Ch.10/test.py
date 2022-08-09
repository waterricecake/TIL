n = int(input())

indegree = [0] * (n+1)
graph = [[] for i in range(n+1)]
time = [0] * (n+1)
total_time = [0] * (n+1)

for i in range(1, n+1):
    d = list(map(int, input().split()))
    time[i] = d[0]
    total_time[i] = d[0]
    most = []
    for x in d[1:-1]:
        indegree[i] +=1
        graph[x].append(i)
        total_time[i] +=time[x]

print(total_time)