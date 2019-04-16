package lambda.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TechSolLuckyDrawWithLambda {
    public static void main(String[] args) {
        List<Integer> lstEmpIds = Arrays.asList(101, 102, 103, 104, 1499, 1501, 1502);
//		check even
        System.out.println("Even");
        TechSolLuckyDrawWithLambda.evaluate(lstEmpIds, id -> id % 2 == 0);
//        check odd
        System.out.println("Odd");
        TechSolLuckyDrawWithLambda.evaluate(lstEmpIds, id -> id % 2 != 0);
//        check greater than 1500
        System.out.println("Greater");
        TechSolLuckyDrawWithLambda.evaluate(lstEmpIds, id -> id > 1500);
    }
    
    public static void evaluate(List<Integer> lstEmpIds, Predicate<Integer> preFInterface) {
        for(int id : lstEmpIds) {
            if(preFInterface.test(id)) {
            		System.out.println(id);
            }
        }
    }
}

