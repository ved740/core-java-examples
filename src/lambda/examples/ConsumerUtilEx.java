package javase8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerUtilEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee4> empList = Arrays.asList(new Employee4(102, 25000), new Employee4(103, 30000));
		new Employee4(0, 0).showEmpDetails(empList, obj -> System.out.println("Emp Id - " + obj.getEmpId()) );
	}

}

class Employee4 {
	private int empId;
	private int salary;
	public Employee4(int id, int sal) {
		// TODO Auto-generated constructor stub
		empId = id;
		salary = sal;
	}
	public void showEmpDetails(List<Employee4> empList, Consumer<Employee4> fn) {
		for (Employee4 e4Obj : empList) {
			fn.accept(e4Obj);
		}
	}
	public int getEmpId() {
		return empId;
	}
	public int getSalary() {
		return salary;
	}
}
