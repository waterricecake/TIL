def check_bal(p):
    right_side = 0
    left_side = 0
    for i in p:
        if i == ")":
            right_side += 1
        elif i == "(":
            left_side += 1
    if right_side != left_side:
        return False
    return True

def check_per(p):
    count = 0
    for i in p:
        if i =="(":
            count += 1
        else:
            if count == 0:
                return False
            count -= 1
    return True

def solution(p):
    answer =""
    u = ""
    if check_per(p):
        return p
    for i in range(len(p)+1):
        if check_bal(p[:i]) and len(p[:i]) != 0 and check_bal(p[i:]):
            u = p[:i]
            w = p[i:]
            break
    if check_per(u) == True:
        answer += u
        answer += solution(w)
    elif check_per(u) == False:
        s = "("+w+")"
        u = list(u[1:-1])
        for i in range(len(u)):
            if u[i] == "(":
                u[i] = ")"
            else:
                u[i] = "("
            s += u[i]
        answer += solution(s)
    return answer