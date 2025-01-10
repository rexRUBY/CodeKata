#include<stdio.h>
#include<string.h>

int main(void) {
	// 소문자, 대문자, 숫자, 공백의 개수
	char str[101];

	while (gets(str) != NULL) {
		int lower = 0;    // 소문자
		int upper = 0;    // 대문자
		int number = 0;   // 숫자
		int space = 0;    // 공백

		int len = strlen(str);
		if (str[len - 1] == '\n')
			len--;

		for (int i = 0; i < len; i++) {
			if (str[i] == 32)
				space++;
			else if (str[i] >= 'a' && str[i] <= 'z')
				lower++;
			else if (str[i] >= 'A' && str[i] <= 'Z')
				upper++;
			else if (str[i] >= '0' && str[i] <= '9')
				number++;
		}
		printf("%d %d %d %d\n", lower, upper, number, space);
	}
}