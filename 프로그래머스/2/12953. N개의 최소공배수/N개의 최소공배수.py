def solution(arr):
    answer = 1
    temp = 2
    divCnt = 0
    
    while(any(num>1 for num in arr)):
        divCnt=0
        for i in range(len(arr)):
            if arr[i]%temp == 0:
                arr[i] //= temp 
                divCnt += 1
        if(divCnt>0):
            answer*=temp
        else:
            temp += 1
    return answer