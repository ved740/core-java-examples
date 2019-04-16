package lambda.examples;

public class MultipleInheritanceWithDefaultMethodsEx {
	public static void main(String[] args) {
		new MultipleInherited().hello();
	}
}

interface Greeting {
	default void hello() {
		System.out.println("Interface Greeitng");
	}
}

interface GreetingExtn {
	default void hello() {
		System.out.println("Interface GreeitngExtn");
	}
}

class MultipleInherited implements Greeting, GreetingExtn {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		Greeting.super.hello();
	}
	
}
