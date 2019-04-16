package lambda.examples;

interface DefaultMethodInterface {
	int NUM = 20;
	abstract void getResources();
	default void implementedMethod() {
		System.out.println("inside interface");
	}
	static void printWelcome() {
		System.out.println("Welcome !");
	}
}

interface StaticMethodInterface {
	static void printWelcome() {
		System.out.println("Welcome1 !");
	}
}

public class Quiz implements DefaultMethodInterface {
	public void implementedMethod() {
		System.out.println("inside class");
	}

	@Override
	public void getResources() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		System.out.println(Quiz.NUM);
	}
}
