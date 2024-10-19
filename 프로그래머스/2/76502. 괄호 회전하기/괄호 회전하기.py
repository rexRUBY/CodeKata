def solution(s):
    answer = 0
    
    for _ in range(len(s)):
        s = s[1:]+s[0]
        if(isPair(s)):
            answer+=1
        
    return answer

def isPair(s):
    for _ in range(len(s)//2):
        if "{}" in s:
            s=s.replace("{}","")
        if "[]" in s:
            s=s.replace("[]","")
        if "()" in s:
            s=s.replace("()","")
    
    if(len(s)==0):
        return True
    else:
        return False
            
            
        