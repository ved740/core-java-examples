package regex.examples;

import java.util.regex.Pattern;

public class SimpleRegexValidatorEx {
	
	static boolean validateSSN(String input) {
		return Pattern.matches("\\d{3}-\\d{2}-\\d{4}", input);
	}
	
	static boolean validateName(String input) {
		return Pattern.matches("([A-Za-z]+\\s?)+", input);
	}
	
	static boolean validateEmail(String input) {
		return Pattern.matches("([A-Za-z]+[0-9]*[_.]*)+(@)[A-Za-z0-9]+(.)([A-Za-z]+.*)", input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Is 123-34-4567 a valid SSN ? " + validateSSN("123-34-4567"));
		System.out.println("Is \"Ved Prakash\" a valid name ? " + validateName("Ved Prakash"));
		System.out.println("Is \"Tom_Jerry@infosys.com\" a valid email ? " + validateEmail("Tom_Jerry@infosys.com"));
		System.out.println("Is \"Tom1.Jerry@infosys.com\" a valid email ? " + validateEmail("Tom1.Jerry@infosys.com"));
		System.out.println("Is \"TomJerry1@domain.com\" a valid email ? " + validateEmail("TomJerry1@domain.com"));
		System.out.println("Is \"TomJerry@domain.co.in\" a valid email ? " + validateEmail("TomJerry@domain.co.in"));
		
		System.out.println("Is \"Tom@Jerry@tom.com\" a valid email ? " + validateEmail("Tom@Jerry@tom.com"));
		System.out.println("Is \"Tom1&Jerry@tom.com\" a valid email ? " + validateEmail("Tom1&Jerry@tom.com"));
		System.out.println("Is \"Tom*Jerry\" a valid email ? " + validateEmail("Tom*Jerry"));
		
	}

}
