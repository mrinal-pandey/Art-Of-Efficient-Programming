a.out : sumUsingH.o sum.o
	gcc sumUsingH.o sum.o
sumUsingH.o : sumUsingH.c sum.h
	gcc -c sumUsingH.c
sum.o : sum.c sum.h
	gcc -c sum.c
