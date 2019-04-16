package javase8.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomMethodRefrencesEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CompareByCity compareByCity = (a, b) -> Student1.compareByCity(a, b);
		List<Student1> studList = new ArrayList<>();
		studList = Arrays.asList(new Student1("Ved", "Barhi"), new Student1("Mani", "Chennai"));
//		compareByCity.compare(studList.get(0), studList.get(1));
//		System.out.println();
		studList.sort(new Student1(null, null)::compareByCity);
		System.out.println(studList);
	}
}

@FunctionalInterface
interface CompareByCity {
	public int compare(Student1 o1, Student1 o2);
}

class Student1 {
	private String name;
	private String city;
	Student1(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public String toString() {
		return "Name : " + name + " City : " + city;
	}
	public int compareByCity(Student1 o1, Student1 o2) {
		return o1.city.compareTo(o2.city);
	}
}
