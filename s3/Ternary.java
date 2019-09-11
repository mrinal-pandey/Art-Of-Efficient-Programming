import java.util.Scanner;
class Ternary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int num1 = 10;
		int num2 = 5;
		int larger = -1;
		
		if(num1 > num2){
			larger = num1;
		}else{
			larger = num2;
		}
		
		// above if construct is same as Ternary construct below

		larger = (num1 > num2) ? num1 : num2;

		System.out.println(larger);
	}
}
