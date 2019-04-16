package streams.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StraemReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath = "test.txt";
		try(Stream<String> stream = Files.lines(Paths.get(filePath))) {
			stream.forEach(str -> System.out.println(str));
		}
		
//		Different type of initializations of stream
//		1. From java.util.List instance
		/*List<String> names = Arrays.asList("Ved", "Prakash", "Gupta");
		Stream<String> stream = names.stream();*/
		
//		2. from Array
		/*String[] names = {"Ved", "Prakash", "Gupta"};
		Stream<String> stream = Arrays.stream(names);*/
		
//		3. from values
		/*Stream<String> stream = Stream.of("Ved", "Prakash", "Gupta");*/
		
//		4. from files - as used at the top
		
//		stream.forEach(System.out::println);
		
	}

}
