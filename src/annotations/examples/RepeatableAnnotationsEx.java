package annotations.examples;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatableAnnotationsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 dStud3 = new DayScholar();
//		get class
		Class c = dStud3.getClass();
//		get declared annotations
		Annotation[] annotations = c.getComponentType().getDeclaredAnnotations();
//		get methods
//		read values

	}

}

@Repeatable(value=ChangeDetails.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ChangeDetail {
	String authorName();
	String methondname();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ChangeDetails {
	ChangeDetail[] value();
}

abstract class Student3 {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	abstract double calculateFee();
}

@ChangeDetail(authorName="Ved",methondname="calculateFee")
@ChangeDetail(authorName="Mantu",methondname="calculateBusFee")
class DayScholar extends Student3 {

	@Override
	double calculateFee() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	double calculateBusFee() {
		return 0;
	}
	
}
