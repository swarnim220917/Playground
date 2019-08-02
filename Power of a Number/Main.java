#include <stdio.h>
    int main()
    {
        int base, exponent;
        long long result = 1;
        scanf("%d", &base);
        scanf("%d", &exponent);
      if(exponent>=0)
      {
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
         printf("%lld", result);
      }
      else
      {
             printf("Wrong input");
      }
        return 0;
    }