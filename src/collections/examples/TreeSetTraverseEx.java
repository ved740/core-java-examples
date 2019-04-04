package collections.examples;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class TreeSetTraverseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Student2> rollStudentMap = new TreeMap<>();
		rollStudentMap.put(101, new Student2(101, 47));
		rollStudentMap.put(102, new Student2(101, 79));
		rollStudentMap.put(103, new Student2(101, 36));
		
		Collection<Student2> studentSet = rollStudentMap.values();
		for (Student2 st2 : studentSet) {
			System.out.println("Grade for roll no " + st2.getRoll() + " is " + st2.getGrade());
		}

	}

}

class Student2 {
	private int rollNo;
	private int totalMarks;
	Student2(int rollNo, int totalMarks) {
		this.rollNo = rollNo;
		this.totalMarks = totalMarks;
	}
	public int getRoll() {
		return rollNo;
	}
	public char getGrade() {
		if(totalMarks >= 60) {
			return 'A';
		} else if (totalMarks > 40) {
			return 'B';
		} else {
			return 'C';
		}
	}
	public String toString() {
		return ""+rollNo;
	}
	@Override
	public boolean equals(Object s2) {
		Student2 another = (Student2) s2; 
//		return this.hashCode() == another.hashCode();
		return this.toString().equals(another.toString());
	}
	@Override
	public int hashCode() {
		return rollNo;
	}
}
