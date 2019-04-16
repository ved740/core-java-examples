package lambda.examples;

public class LambdaThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread threadInstance = new Thread(() -> { System.out.println("Its me from Thread"); });
        threadInstance.start();

	}

}
