from collections import Counter

def solution(k, tangerine):
    answer = 0
    total = 0
    
    frequency = Counter(tangerine)
    frequent = sorted(frequency.values(), reverse=True)
    
    for i in frequent:
        total += i
        answer += 1
        
        if(total >= k):
            break

    return answer