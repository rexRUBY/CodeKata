import sys

arr = []
max_len = 0

# 1. 5줄의 입력 받기 및 최대 길이 찾기
for _ in range(5):
    line = sys.stdin.readline().strip()
    arr.append(line)
    if len(line) > max_len:
        max_len = len(line)

# 2. try-except로 세로 읽기
result = ''
for i in range(max_len):
    for j in range(5):
        try:
            result += arr[j][i]
        except IndexError:
            # 인덱스 에러가 발생하면 아무것도 하지 않고 넘어감
            pass

print(result)