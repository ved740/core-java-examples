import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter a two digit number : ");
			num = sc.nextInt();
		} while(num < 10);
		sc.close();
		
		int a[] = {23, 31};
		for (float i : a) {
			System.out.println(i);
		}
	}

}
