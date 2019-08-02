#include <stdio.h>
int main()
{
  int n1,n2,s,gcd,g,lcm;
  scanf("%d%d",&n1,&n2);
  s=n1>n2?n2:n1;
  for(gcd=s;gcd>-1;gcd--)
  {
    if((n1%gcd==0) && (n2%gcd==0))
    {
      g=gcd;
      break;
    }
  }
  lcm=(n1*n2)/g;
    printf("%d",lcm);
   return 0;
}