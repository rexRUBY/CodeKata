a = input()
b = input()
cnt = 0
idx = 0

while idx != -1:
    if(cnt == 0):
        idx = a.find(b)
        if(idx != -1):
            cnt += 1
        else:
            print(0)
            break

    idx = a.find(b, idx+len(b))
    if(idx != -1):
        cnt += 1
    else:
        print(cnt)
        break