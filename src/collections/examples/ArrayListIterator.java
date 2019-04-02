package collections.examples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrOfStr = new ArrayList<>(); 
		arrOfStr.add("JS");
		arrOfStr.add("Java");
		arrOfStr.add("DOt Net");
		arrOfStr.add("Python");
		
		ListIterator<String> li = arrOfStr.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}
