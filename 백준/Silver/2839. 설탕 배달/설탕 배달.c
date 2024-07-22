#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int Delivery(int kg)
{
    int cnt = 0;

    while (kg > 0)
    {
        if (kg % 5==0)
        {
            kg -= 5;
            cnt++;
        }
        else if (kg % 3==0)
        {
            kg -= 3;
            cnt++;
        }
        else if (kg > 5)
        {
            kg -= 5;
            cnt++;
        }
        else
        {
            return -1;
            break;
        }
    }
    return cnt;
}

int main()
{
    int kg;

    scanf("%d", &kg);

    printf("%d", Delivery(kg));
}