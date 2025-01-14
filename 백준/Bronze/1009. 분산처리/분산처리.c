#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int repeat = 0;
	scanf("%d", &repeat);

	for (int i = 0; i < repeat; i++) {
		int a = 0, b = 0, result = 1;
		scanf("%d %d", &a, &b);
		
		for (int j = 0; j < b; j++) {
			result = (a * result) % 10;
		}
		if (result == 0)
			result = 10;
		printf("%d\n", result);
	}
}