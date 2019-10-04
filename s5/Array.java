import java.util.Scanner;
class Array{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] a = {1, 2, 4, 5};
		int updateIndex = in.nextInt();
		int updateValue = in.nextInt();
		//Check for updateIndex before updating the value
		a[updateIndex] = updateValue;
	}
}
