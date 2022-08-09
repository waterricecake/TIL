def key_turn(key):
    turn_key = [[0 for _ in range(len(key))] for __ in range(len(key))]
    for i in range(len(key)):
        for k in range(len(key)):
            turn_key[k][len(key) - i-1] = key[i][k]
    return turn_key

def solution(key, lock):
    lockreal = [[0 for _ in range(3 * len(lock))] for _ in range(3 * len(lock))]
    for i in range(len(lock)):
        for j in range(len(lock)):
            lockreal[i+len(lock)][j+len(lock)] = lock[i][j]
    
    
    for _ in range(4):
        for i in range(len(lockreal)-len(key)+1):
            for j in range(len(lockreal)-len(key)+1):
                
                
                for k in range(len(key)):
                    for h in range(len(key)):
                        lockreal[k+i][h+j] += key[k][h]
                
                
                lock_len = len(lockreal)//3
                for x in range(lock_len, lock_len *2):
                    for y in range(lock_len, lock_len *2):
                        if lockreal[x][y] == 2 or lockreal[x][y] == 0:
                            continue
                        else:
                            return True
                
                for k in range(len(key)):
                    for h in range(len(key)):
                        lockreal[k+i][h+j] -= key[k][h]
                
                key = key_turn(key)
                        
                    
    return False


print(solution([[0,0,0],[1,0,0],[0,1,1]],[[1,1,1],[1,1,0],[1,0,1]]))