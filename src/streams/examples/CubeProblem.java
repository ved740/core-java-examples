package streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CubeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
		numList = numList.stream().map(num -> num * num * num).collect(Collectors.toList());
		numList.forEach(System.out::println);

	}

}
