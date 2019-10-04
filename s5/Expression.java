class Expression{
	public static void main(String[] args){
		int result = (5 - 3 + 5 * 2 / 3) % 2;
		System.out.println(result); 	       // 1, 5 * 2 before 2 / 3
		
		int a = 6, b = 5, c = 2;
		c = c * (a > b ? a : b);
		System.out.println(c);   	       // 12, c = c * a
		
		int x = 2, y = 1;
		System.out.println(x | y); 	       // 3, 010 | 001
		System.out.println(x & y); 	       // 0, 010 & 001
		System.out.println(x ^ y); 	       // 3, 010 ^ 001
		
		System.out.println(5 / 2);             // 2
		System.out.println(5.0 / 2);           // 2.5
		System.out.println((double)5 / 2);     // 2.5, same as above
		System.out.println((double)(5 / 2));   // 2.0, 2 gets converted to 2.0
		System.out.println(5 % 2);             // 1
		System.out.println(5.0 % 2);           // 1.0
	}
}
