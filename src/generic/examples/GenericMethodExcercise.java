package generic.examples;

public class GenericMethodExcercise {
	
	static <T> void printArray(T[] arr) {
		for(T item: arr) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
				Integer[] arrInteger = { 10, 20, 30, 40, 50, 60 };
				Character[] arrChar = { 'I', 'N', 'F', 'O', 'S', 'Y', 'S' };
				Double[] arrDouble = { 100.1, 200.1, 300.1, 400.1, 500.1, 600.1 };
				GenericMethodExcercise tg = new GenericMethodExcercise();
				tg.printArray(arrInteger);
				tg.printArray(arrChar);
				tg.printArray(arrDouble);
			}

}

