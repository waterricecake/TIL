def posible(answer):
    for x,y,a in answer:
        if y == 0:
            continue
        if a == 1:
            if [x,y-1,0] not in answer and [x+1,y-1,0] not in answer:
                 if [x-1,y,1] not in answer or [x+1,y,1] not in answer:
                    return False
        elif a==0:
            if [x,y-1,0] not in answer and [x,y,1] not in answer and [x-1,y,1] not in answer:
                return False
    return True
def solution(n,build_frame):
    answer = []
    for x,y,a,b in build_frame:
        if b == 1:
            answer.append([x,y,a])
            if not posible(answer):
                answer.remove([x,y,a])
        elif b == 0:
            if [x,y,a] in answer:
                answer.remove([x,y,a])
            if not posible(answer):
                answer.append([x,y,a])
    answer.sort()
    return answer


n = 5
build_frame = [[1,0,0,1],[1,1,1,1],[2,1,0,1],[2,2,1,1],[5,0,0,1],[5,1,0,1],[4,2,1,1],[3,2,1,1]]
print(solution(5,build_frame))