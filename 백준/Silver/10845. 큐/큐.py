import sys
import collections

# 입력 속도 개선
input = sys.stdin.readline
n = int(input())
q = collections.deque()

for _ in range(n):
    command = input().split()
    cmd = command[0]

    if cmd == 'push':
        q.append(int(command[1]))
    elif cmd == 'pop':
        if not q:
            print(-1)
        else:
            print(q.popleft())
    elif cmd == 'size':
        print(len(q))
    elif cmd == 'empty':
        if not q:
            print(1)
        else:
            print(0)
    elif cmd == 'front':
        if not q:
            print(-1)
        else:
            print(q[0])
    elif cmd == 'back':
        if not q:
            print(-1)
        else:
            print(q[-1])