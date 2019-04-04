package collections.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableAndComparatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student3> studentSet = new ArrayList<>();
		studentSet.add(new Student3("Vikash", 23));
		studentSet.add(new Student3("Chandan", 32));
		studentSet.add(new Student3("Ved", 99));
		
		Collections.sort(studentSet);
		
		System.out.println("Sorted by comparable (name) :");
		Iterator<Student3> studCIter = studentSet.iterator();
		while(studCIter.hasNext()) {
			System.out.println(studCIter.next());
		}
		
		System.out.println("Sorting by comparator (totalMarks) :");
		Collections.sort(studentSet, new TotalMarksComparator());
		
		for(Student3 student: studentSet) {
			System.out.println(student);
		}

	}

}

class Student3 implements Comparable<Student3>	{
	private String name;
	private int totalMarks;
	
	Student3(String name, int totalMarks) {
		this.name = name;
		this.totalMarks = totalMarks;
	}

	@Override
	public int compareTo(Student3 o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	public int getTotalMarks() {
		return totalMarks;
	}
	
	public String toString() {
		return "Name : " + name + ", Marks : " + totalMarks;
	}
	
}

class TotalMarksComparator implements Comparator<Student3>{

	@Override
	public int compare(Student3 o1, Student3 o2) {
		// TODO Auto-generated method stub
		return o1.getTotalMarks() - o2.getTotalMarks();
	}

	
	
}
