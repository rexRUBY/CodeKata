# Time = 900 ms
# Memory = 42024 KB
from sys import stdin
n = stdin.readline()
N = sorted(map(int,stdin.readline().split()))
m = stdin.readline()
M = map(int, stdin.readline().split())

for x in M:
    s, e = 0, len(N)-1
    while True:
        if s > e:
            print('0')
            break
        m = (s+e) // 2
        if N[m] == x:
            print('1')
            break
        elif N[m] > x: e = m - 1
        else: s = m + 1