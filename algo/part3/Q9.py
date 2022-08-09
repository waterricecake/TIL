def solution(s):
    answer = len(s)

    indeed = [s]
    for i in range(1, len(s)//2 +1):
        stt = ""
        prev = s[0:i]
        count = 1
        for j in range(i,len(s),i):
            if prev == s[j:j+i]:
                count += 1
            else:
                stt += str(count) + prev if count >=2 else prev
                prev = s[j:j+i]
                count = 1
        stt += str(count) + prev if count >=2 else prev
        indeed.append(stt)
    answer = min(len(k) for k in indeed) 
    return answer
