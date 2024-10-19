def solution(elements):
    eLen = len(elements)
    elements = elements * 2
    numset = set()
    
    for i in range(eLen):
        for j in range(eLen):
            numset.add(sum(elements[j:i+j+1]))
    return len(numset)