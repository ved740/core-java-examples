package javase8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionUtilEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee3> empList = Arrays.asList(new Employee3(102, 25000), new Employee3(103, 30000));
		for(Employee3 emp: empList) {
			System.out.println(emp.getNewSalary(emp, e1 -> 2 * e1.getSalary()));
		}

	}
	
	

}

class Employee3 {
	private int empId;
	private int salary;
	public Employee3(int id, int sal) {
		// TODO Auto-generated constructor stub
		empId = id;
		salary = sal;
	}
	public int getNewSalary(Employee3 emp, Function<Employee3, Integer> fn) {
		return fn.apply(emp);
	}
	public int getSalary() {
		return salary;
	}
}


