// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n1,n2,s,gcd;
  scanf("%d%d",&n1,&n2);
  s=n1>n2?n2:n1;
  for(gcd=s;gcd>-1;gcd--)
  {
    if((n1%gcd==0) && (n2%gcd==0))
    {
      printf("%d",gcd);
      break;
    }
  }
   return 0;
}