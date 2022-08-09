INF = 99999

graph = [
    [0,7,5],
    [7,0,INF],
    [5,INF,0]
]

print("인접 행렬: ", graph)

graphL = [[] for _ in range(3)]

graphL[0].append((1,7))
graphL[0].append((2,5))
graphL[1].append((0,7))
graphL[2].append((0,5))
""
print("인접 리스트: ", graphL)