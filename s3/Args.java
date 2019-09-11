// Compile as javac Args.java and Execute as "java Hello 10"

import java.util.*;
class Args{
	public static void main(String[] args){
		System.out.println(args[0]);
		System.out.println(Integer.valueOf(args[1]));
	}
}
