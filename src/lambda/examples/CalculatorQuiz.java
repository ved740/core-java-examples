package javase8.examples;

import java.util.function.BiFunction;

public class CalculatorQuiz {
    //main
    public static void main (String pars[]) {
        // call evaluate for adding two int values
    	Integer i1 = 19;
    	Integer i2 = 10;
    	System.out.println(CalculatorQuiz.evaluate(i1, i2, (a, b) -> a + b));
    	System.out.println(CalculatorQuiz.evaluate(i1, i2, (a, b) -> a - b));
    	System.out.println(CalculatorQuiz.evaluate(i1, i2, (a, b) -> a * b));
        // call evaluate for subtracting two int values
        // call evaluate for multiplying two int values
    }
    public static Integer evaluate(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {
        return fn.apply(t, u);
    }
}

