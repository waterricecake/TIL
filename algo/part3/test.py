from itertools import combinations

arr =[["X","S","X","X","T"]
,     ["T","X","S","X","X"]
,     ["X","X","X","X","X"]
,     ["X","T","X","X","X"]
,     ["X","X","T","X","X"]]
p = []
for i in range(5):
    for j in range(5):
        p.append([i,j])
print(list(combinations(p,3)))
