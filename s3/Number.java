import java.util.Scanner;
class Number{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = Integer.valueOf(args[0]);
		int primeFlag = 0;
		printTable(N);
		primeFlag = checkPrime(N);
		if(primeFlag == 1){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
	}
	
	// each function should do the task assigned to it
	
	static void printTable(int N){
		// do the printing of the table
	}
	static int checkPrime(int N){
		// just check prime and return 1 if number is prime else 0
	}
}
