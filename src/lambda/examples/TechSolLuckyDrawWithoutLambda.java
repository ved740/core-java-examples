package lambda.examples;

import java.util.Arrays;
import java.util.List;

public class TechSolLuckyDrawWithoutLambda {
    public static void main(String[] args) {
        List<Integer> lstEmpIds = Arrays.asList(102, 102, 103, 104, 1499, 1501, 1502);
		// lstEmpIds is the populated list of employee ids
        printEvenIds(lstEmpIds);
        printOddIds(lstEmpIds);
        printIdsForStock(lstEmpIds);
    }
    
    public static void printEvenIds(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id % 2 == 0) System.out.println("Even Employee Id: " + id);
        }
    }
    
    public static void printOddIds(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id % 2 != 0) System.out.println("Odd Employee Id: " + id);
        }
    }
    
    public static void printIdsForStock(List<Integer> lstEmpIds) {
        for(int id : lstEmpIds) {
            if(id < 1500) System.out.println("Employee Id less than 1500: " + id);
        }
    }
}

