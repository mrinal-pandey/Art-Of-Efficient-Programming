#include<stdio.h>

int main()
{
	int x = 20;
	int y = 20;
	int z = 20;
	printf("%d", x == y == z); // x == y gives 1(true) and then 1 == z gives 0(false)
}
