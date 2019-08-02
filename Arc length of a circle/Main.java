#include <stdio.h>
void main()
{
float r,a,arc;
scanf("%f", &r);
scanf("%f", &a);
arc=(2*3.14*r*a)/360;
printf("%0.2f",arc);
return 0;
}