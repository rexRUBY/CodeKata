n = int(input())

if n == 1:
    print(1)
else:
    end = 1
    cnt = 1

    while end < n:
        end += 6*cnt
        cnt += 1
    print(cnt)