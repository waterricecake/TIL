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

def check_per(now,stack,p):
    print(now, " ",p[now], stack)
    if now < len(p):
        if p[now] == "(":
            stack.append(p[now])
            check_per(now+1, stack, p)
        else:
            if len(stack) == 0:
                return False
            else:
                stack.pop()
                check_per(now+1,stack,p)
                
    if len(stack) == 0:
        return True
    return False


check = True
answer = ""

def solution(p):
    global answer
    if check_per(0,[],p):
        answer += p
    if len(p) == len(answer):
        return answer
    for i in range(len(p)+1):
        if check_bal(p[:i]) and len(p[:i]) !=0 :
            if check_bal(p[i:]):
                u = p[:i]
                w = p[i:]
                if check_per(0,[],u):
                    answer += u
                    solution(w)
                else:
                    s = "(" + w + ")" + u[1:-1]
                    solution(s)
p ="()((()))()))(("
print(len(p))
print(check_per(0,[],p))