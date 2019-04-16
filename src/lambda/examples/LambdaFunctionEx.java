package lambda.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ved", "Chandan", "Vikash", "Raj");
		Comparator<String> comparatorFn = (a, b) -> a.compareTo(b);
		names.sort(comparatorFn);
//		names.sort((a, b) -> a.compareTo(b));
		System.out.println(names);

	}

}
