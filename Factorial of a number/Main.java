#include <stdio.h>
int main() 
{
  int i, num; long fac =1;
  scanf("%d",&num);
  for(i=1; i <= num; ++i)
   fac *= i;
  printf("%d",fac);
    return 0;
}