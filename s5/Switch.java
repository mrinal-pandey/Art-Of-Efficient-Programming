class Switch{
	public static void main(String[] args){
	// switch first checks all the cases and if nothing matches, it goes for default wherever it is, hence output is "Default" and "1" here, "1" due to fall through
		switch(3){
			default:
				System.out.println("Default");
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
		}
	}
}
