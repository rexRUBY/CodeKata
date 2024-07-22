num = int(input())
count = 0

for i in range(1, num+1):
    if i < 100:
        count += 1
    else:
        num_list = [int(n) for n in str(i)]
        diff_one = num_list[0] - num_list[1]
        diff_two = num_list[1] - num_list[2]
        if diff_one == diff_two:
            count += 1
print(count)