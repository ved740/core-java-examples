package javase8.examples;

public class LambdaCustomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "Lambda";
		String input2 = "Expression";
		FormatString fmt1 = (i1, i2) -> i1 + " " + i2;
		FormatString fmt2 = (i1, i2) -> i1 + " - " + i2; 
		FormatString fmt3 = (i1, i2) -> i1.toUpperCase() + " " + i2.toUpperCase(); 
		System.out.println(fmt1.format(input1, input2));
		System.out.println(fmt2.format(input1, input2));
		System.out.println(fmt3.format(input1, input2));
	}

}

@FunctionalInterface
interface FormatString {
	String format(String i1, String i2);
}


