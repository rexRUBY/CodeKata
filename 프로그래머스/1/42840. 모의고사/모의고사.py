def solution(answers):
    answer = [0,0,0]
    student =[[1, 2, 3, 4, 5],[2, 1, 2, 3, 2, 4, 2, 5], [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]]
    for i in range(len(answers)):
        for j in range(len(student)):
            if answers[i] == student[j][i % len(student[j])]:
                answer[j] += 1
    return [i+1 for i, score in enumerate(answer) if max(answer) == score]

print(solution([1,3,4,5]))