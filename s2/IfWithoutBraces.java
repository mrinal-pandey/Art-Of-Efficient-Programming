import java.util.*;
class IfWithoutBraces{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 100; ++i){
		// no braces after if, not a good practice
			if(i == 0)
				System.out.println("Hey!");
			if(i == 50)
				System.out.println("I am in middle!");
		}
	}
}
