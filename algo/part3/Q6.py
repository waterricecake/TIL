def solution(food_times, k):
    n = len(food_times)
    i = 0
    for t in range(k+1):
        now = i % n
        if food_times[now] != 0:
            food_times[now] -= 1
            i += 1
        else:
            p =0
            while p < n:
                i += 1
                now = i % n
                if food_times[now] != 0:
                    food_times[now] -= 1
                    i += 1
                    break
                p += 1
            if p == n:
                now = -1
    answer = now+1
    return answer