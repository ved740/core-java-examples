package collections.examples;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListAddRemoveEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Java");
		ll.add("C");
		ll.add("C++");
		ll.add("JS");
		
		for(int index=0; index<ll.size(); index++) {
			System.out.println("Value at index " + index + " is " + ll.get(index));
		}
		
		ll.removeFirst();
		ll.removeLast();
		
		for(String item: ll) {
			System.out.println("Item : " + item);
		}
		
		ll.addFirst("New First");
		ll.addLast("New Last");
		
		Iterator<String> sI = ll.iterator();
		
		while(sI.hasNext()) {
			System.out.println("Next iteerated value " + sI.next());
		}

	}

}
