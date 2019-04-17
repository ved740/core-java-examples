package streams.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateNumbersAndSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Problem : Generate first 50 whole numbers and calculate their sum 
		 * Make use of iterate and reduce stream function
		 *  
		 * */
		
		List<Integer> intList = Stream.iterate(0, n -> n + 1).limit(10000000).collect(Collectors.toList());
//		System.out.println(intList.stream().map(Object::toString).collect(Collectors.joining(", ")));
		int sum = intList.stream().reduce(0, Integer::sum);
		System.out.println("Sum : " + sum);
		

	}

}
