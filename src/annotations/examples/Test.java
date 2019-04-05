package annotations.examples;


import java.lang.annotation.*;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
 @interface Author
{
	String value();
}
@Author("Mark")
class A{}
class B extends A{}
