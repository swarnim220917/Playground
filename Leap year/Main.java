#include <stdio.h>

int main()
{
    int yr;
    scanf ("%d", &yr);

    if (yr%4 == 0 && yr%100 == 0 && yr%400 == 0)
        printf("Leap year");

    else if (yr%4==0 && yr%100!=0)
        printf("Leap year");
    else
        printf ("Not Leap year");

    return 0;
}