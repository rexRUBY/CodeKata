#include <stdio.h>
#include <string.h>

int main(void) {
	int alpha[26] = { 0, };
	char str[51];
	int max = 0;

	while (fgets(str, sizeof(str), stdin) != NULL) {
		int len = strlen(str);

		for (int i = 0; i < len; i++) {
			if (str[i] >= 'a' && str[i] <= 'z') {
				alpha[str[i] - 'a']++;
				
				if (max < alpha[str[i] - 'a']) {
					max = alpha[str[i] - 'a'];
				}
			}
		}
	}

	for (int i = 0; i < 26; i++) {
		if (alpha[i] == max) {
			printf("%c", i + 'a');
		}
	}
}