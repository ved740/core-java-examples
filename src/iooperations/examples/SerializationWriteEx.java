package iooperations.examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class SerializationWriteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (OutputStream fos = new FileOutputStream("serial-output.bin")) {
			Set<CourseIO1> courses = new HashSet<>();
			courses.add(new CourseIO1("Java"));
			courses.add(new CourseIO1("JavaScript"));
			
			StudentIO1 stud1 = new StudentIO1(1001, "Ved", "Prakash", "Sept 30, 1989", courses, 29);
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(stud1);
			
			os.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
