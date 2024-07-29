import math

def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        count = 0
        for j in range(1, int(math.sqrt(i))+1):
            if i % j == 0:
                if j * j == i:
                    count += 1
                else:
                    count += 2
        if count % 2 == 0:
            answer += i
        else:
            answer -= i
    return answer