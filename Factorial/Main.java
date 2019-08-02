    #include <stdio.h>
    int main()
    {
     long int c, n, fact = 1;
       scanf("%ld", &n);
      for (c = 1; c <= n; c++)
      {
        fact = fact * c;
      }
      printf("%ld", fact);
       
      return 0;
    }