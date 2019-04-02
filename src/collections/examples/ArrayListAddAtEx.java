package collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddAtEx {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		nameList.add(0,"One");
		nameList.add(1,"Two");
		for(String no:nameList){
			System.out.println(no);
		}
	}
}
