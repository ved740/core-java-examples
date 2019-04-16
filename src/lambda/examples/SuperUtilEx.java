package lambda.examples;

import java.util.function.Supplier;

public class SuperUtilEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int greaterThan = 100;
		int lessThan = 200;
//		int res = (int) (greaterThan + (lessThan - greaterThan) * Math.random());
//		System.out.println(res);
		int res = SuperUtilEx.getRamdom(() -> (int) (greaterThan + (lessThan - greaterThan) * Math.random()));
		System.out.println(res);
	}
	
	static int getRamdom(Supplier<Integer> fn) {
		return fn.get();
	}

}


