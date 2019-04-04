package collections.examples;

import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDecAndIterateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create sets
		Set<Courses12> courseSet1 = new HashSet<>();
		courseSet1.add(new Courses12("BB101a", "J2SE"));
		courseSet1.add(new Courses12("BB101b", "J2EE"));
		
		Set<Courses12> courseSet2 = new HashSet<>();
		courseSet2.add(new Courses12("JS-101", "ES5"));
		courseSet2.add(new Courses12("JS-102", "ES6"));
		
		//initialize HashMap - add key values
		Map<Integer, Set<Courses12>> studentIdCourseSetMap = new HashMap<>();
		studentIdCourseSetMap.put(101, courseSet1);
		studentIdCourseSetMap.put(102, courseSet2);
		
		//Fetch Keys - Iterate
		Set<Integer> keySet = studentIdCourseSetMap.keySet();
		System.out.println("Fetching keys:");
		for(Integer key: keySet) {
			System.out.println(key);
		}
		
		//Fetch Values - Iterate
		Collection<Set<Courses12>> valueSet = studentIdCourseSetMap.values();
		System.out.println("Fetching Values :");
		int counter = 1;
		for(Set<Courses12> value :valueSet) {
			System.out.println("Item " + counter + " :");
			counter++;
			for(Courses12 course : value) {
				System.out.println(course.toString());
			}
		}

	}

}

class Courses12 {
	private String courseCode;
	private String courseName;
	Courses12(String a, String b) {
		courseCode = a;
		courseName = b;
	}
	public String toString() {
		return "Code : " + courseCode + ", Name : " + courseName;
	}
}
