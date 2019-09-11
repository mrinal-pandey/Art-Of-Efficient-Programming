Steps to follow:
1. Make an interface file
2. Implement functions of interface file in a different file with same name as interface file.
3. Write code on client side to call the methods of interface file

-> Compile client files and server files
-> Link object files created
-> Run the code to get output

For C:
-> gcc -c sum.c
-> gcc -c client.c
-> gcc sum.o client.o
-> ./a.out

In Java:
-> Create a class which has interface in it.
-> Create a class which implements the interface we created.
-> Create a package and put the above mentioned classes in it.
-> Create client file in which we import the class with implementation and use methods directly.

In Python:
-> Some sources mention that this method of writing codes is not followed, but a slightly different approach is suggested. I would share these sources as links on the WhatsApp group we have.
