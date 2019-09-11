// This is the client file which just accesses the functions without knowing their implementation

#include "sum.h"	// including my interface (header file)
#include<stdio.h>

int main()
{
	int a, b;
	scanf("%d%d", &a, &b);
	printf("%d", sum(a, b));	// calling sum method
}
