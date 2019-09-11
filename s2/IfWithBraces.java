import java.util.*;
class IfWithBraces{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 100; ++i){
			// having braces is good as it reduces the possibilty of error and makes modification of code easier
			if(i == 0){
				System.out.println("Hey!");
			}
			if(i == 50){
				System.out.println("I am in middle!");
			}
		}
	}
}
