package collections.examples;

import java.util.LinkedList;

class Employee {
    private int empId;
    public Employee(int empId) {
        this.empId = empId;
    }
}
public class LinkedListAddFirstEx {
    public static void main(String[] args) {
        LinkedList <Employee> firstList = new LinkedList<>(); 
        LinkedList <Employee> secondList = new LinkedList<>(); 
        firstList.addFirst(new Employee(2034));
        secondList.addFirst(new Employee(2034));
        if(firstList.contains(secondList.getFirst())){
             System.out.println("Values are Same"); 
        }else{ 
             System.out.println("Values are Not Same");
        }
    }
}
