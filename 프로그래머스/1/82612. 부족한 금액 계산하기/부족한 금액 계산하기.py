def solution(price, money, count):
    answer = (count * (2*price + (count-1)*price) / 2) - money
    print(answer)
    
    if answer >= 0 :
        return answer
    return 0
