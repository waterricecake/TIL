from collections import deque


def bfs(n, graph,k,start):
    city = [[False,0] for _ in range(n +1)]
    queue = deque([start])
    city[start][0] = True
    while queue:
        now = queue.popleft()
        for node, next_node in graph:
            if node == now:
                if not city[next_node][0]:
                    queue.append(next_node)
                    city[next_node][1] = city[now][1] + 1
                    city[next_node][0] = True
    check = False
    answer = []
    for i in range(len(city)):
        if city[i][1] == k:
            check = True
            answer.append(i)
    if check == False:
        print(-1)
    answer.sort()
    for i in answer:
        print(i)

"""
n,m,k,x = map(int,input().split())
graph = []
for _ in range(n):
    graph.append(list(map(int,input().split())))
bfs(n, graph,x, k)
n = 4
city = [[False, 0] for _ in range(n+1)]
graph = [[1,2],[1,3],[2,3],[2,4]]
bfs(n,graph,1,2)

n = 4
city = [[False, 0] for _ in range(n+1)]
graph = [[1,2],[1,3],[1,4]]
bfs(n,graph,1,2)

n = 4
city = [[False, 0] for _ in range(n+1)]
graph = [[1,2],[1,3],[2,3],[2,4]]
bfs(n,graph,1,1)
"""

n = 5
graph = [[1,2],[1,3],[2,4],[3,5]]
bfs(n,graph,2,1)