#include<stdio.h>
int main()
{
  int temp1, temp2, num;
   scanf("%d",&num);
        temp1=num%10;                  
        num=num/10;                    
        temp2=num%10;
  printf("%d",temp2);
  return 0;
}