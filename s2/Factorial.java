// do not go for recursion, it uses stack unnecessarily

import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int fact = 1;
		// number of times loop runs is known so go for a 'for' loop
		for(int i = 1; i <= N; ++i){
			fact *= i;
		}
		System.out.println(fact);
	}
}
