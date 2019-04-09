package iooperations.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SerializationWriteReadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (OutputStream fos = new FileOutputStream("serial-output.bin"); InputStream inputFile = new FileInputStream("serial-output.bin")) {
			Set<CourseIO1> courses = new HashSet<>();
			courses.add(new CourseIO1("Java"));
			courses.add(new CourseIO1("JavaScript"));
			
			StudentIO1 stud1 = new StudentIO1(1001, "Ved", "Prakash", "Sept 30, 1989", courses, 29);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(stud1);
			
			os.close();
			
			ObjectInputStream ois = new ObjectInputStream(inputFile);
			StudentIO1 stIo1 = (StudentIO1) ois.readObject();
			System.out.println(stIo1);
			ois.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class StudentIO1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private int studId;
	private String firstName;
	private String lastName;
	private String dob;
	private Set<CourseIO1> courses;
	private int age;
	
	StudentIO1(int studId, String firstName, String lastName, String dob, Set<CourseIO1> courses, int age) {
		this.studId = studId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.courses = courses;
		this.age = age;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Set<CourseIO1> getCourses() {
		return courses;
	}

	public void setCourses(Set<CourseIO1> courses) {
		this.courses = courses;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return studId + " #### " + firstName + " #### " + lastName + " #### " + dob + " #### " + courses + " #### " + age;
	}
	
}

class CourseIO1 implements Serializable {
	private String name;
	
	public CourseIO1(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
}
