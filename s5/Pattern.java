import java.util.*;
class Pattern{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		String patternString = in.nextLine();
		String replaceString = in.nextLine();
		// We should first check if pattern is present in input string and then go for replacement and the below function should only perform replace operation, we should have a separate function for finding pattern in string
		replace(inputString, patternString, replaceString); // create an object and then call this function
	}
	static void replace(String inputString, String patternString, String replaceString){
		// Finds patternString in inputString and replaces the patternString
		// with replaceString wherever it is found
	}
}
