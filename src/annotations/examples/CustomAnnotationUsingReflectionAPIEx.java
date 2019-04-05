package annotations.examples;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class CustomAnnotationUsingReflectionAPIEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student2 dStud2 = new DayScholar();
		Class c = dStud2.getClass();
		Annotation[] annotations = c.getDeclaredAnnotations();
		for(Annotation annotation: annotations) {
//			print annotation - name
			System.out.println(annotation.annotationType().getName());
//			Fetches the list of attributes of the annotation
			Method[] methods = annotation.annotationType().getDeclaredMethods();
			for(Method method: methods) {
				//Print the attribute name 		
				//Fetch the value for the attribute
				Object value = method.invoke(annotation, (Object[]) args);
				System.out.println(method.getName() + " : " + value);
			}
		}

	}

}

/**
 * @author ved.prakash01 Create a custom annotation - ChnageDetail 
 * ChangeDetail keep track of which developer modified which method in the annotated 
 * @Retention : tells the validity upto which the annotation will remain valid
 * @Target: tells the scope of implementation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface ChangeDetail {
	String authorName();
	String methodName();
}

abstract class Student2 {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	abstract double calculateFee();
}

@ChangeDetail(authorName="VP", methodName="calculateFee")

class DayScholar extends Student2 {

	@Override
	double calculateFee() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
