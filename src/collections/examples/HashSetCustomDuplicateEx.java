package collections.examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetCustomDuplicateEx {
	
	public static void main(String[] args) {
		Set<Student1> sSet = new HashSet<>();
		sSet.add(new Student1(1234));
		sSet.add(new Student1(1234));
		System.out.println(sSet);
	}

}

class Student1 {
	private int rollNo;
	Student1(int rollNo) {
		this.rollNo = rollNo;
	}
	public String toString() {
		return ""+rollNo;
	}
	@Override
	public boolean equals(Object s2) {
		Student1 another = (Student1) s2; 
//		return this.hashCode() == another.hashCode();
		return this.toString().equals(another.toString());
	}
	@Override
	public int hashCode() {
		return rollNo;
	}
}
