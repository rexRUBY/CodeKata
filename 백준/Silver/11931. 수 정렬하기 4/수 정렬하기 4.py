import sys
a = int(sys.stdin.readline())
arr = []

for _ in range(a):
    arr.append(int(sys.stdin.readline()))

arr.sort(reverse=True)

for i in arr:
    print(i)
    i+=1