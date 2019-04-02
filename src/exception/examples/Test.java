package exception.examples;

class Test {
	
	public static void divide(int m, int n) {
		try {
			int p = m/n;
			System.out.println(p);
		} 
		catch(ArithmeticException e) {
			System.out.println("SHould not divide by 0");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(5, 0);
	}

}
