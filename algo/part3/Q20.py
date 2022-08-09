from itertools import combinations
n = 5#int(input())
arr =[["X","S","X","X","T"]
,     ["T","X","S","X","X"]
,     ["X","X","X","X","X"]
,     ["X","T","X","X","X"]
,     ["X","X","T","X","X"]]
#for _ in range(n):
#    arr.append(list(input().split()))
def check_t(arr):
    for i in range(n):
        for j in range(n):
            if arr[i][j] == "T":
                ni, nj = i, j
                while ni < n:
                    if arr[ni][j] == "O":
                        break
                    elif arr[ni][j] == "S":
                        return True
                    else:
                        ni +=1
                ni, nj = i, j
                while 0<=ni:
                    if arr[ni][j] == "O":
                        break
                    elif arr[ni][j] == "S":
                        return True
                    else:
                        ni -=1
                ni, nj = i, j
                while nj < n:
                    if arr[i][nj] == "O":
                        break
                    elif arr[ni][j] == "S":
                        return True
                    else:
                        nj +=1
                ni, nj = i, j
                while 0<=nj:
                    if arr[i][nj] == "O":
                        break
                    elif arr[ni][j] == "S":
                        return True
                    else:
                        nj -=1
    return False  
c = 0
""""
def dfs(cnt):
    global c
    if cnt == 3:
        c += 1
        print(c)
        if not check_t(arr):
            return "YES"
        return
    for i in range(n):
        for j in range(n):
            if arr[i][j] == "X":
                arr[i][j] = "O"
                cnt +=1
                dfs(cnt)
                cnt -= 1
                arr[i][j] = "X"
    return
"""
p = []
check = False
for i in range(n):
    for j in range(n):
        p.append([i,j])
case = list(combinations(p,3))
for cases in case:
    for i in range(3):
        if arr[cases[i][0]][cases[i][1]] == "X":
            arr[cases[i][0]][cases[i][1]] = "O"
    if check_t(arr):
        print("YES")
        check = True
        break
    for i in range(3):
        arr[cases[i][0]][cases[i][1]] = "X"
if not check:
    print('NO')
