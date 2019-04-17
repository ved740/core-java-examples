package streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee13> empList = Arrays.asList(new Employee13("Ved", 101, 5, 40000), new Employee13("Atul", 102, 3, 30000), new Employee13("Raj", 103, 8, 60000));
//		Update each salary by 5000
		empList = empList.stream().map(obj -> { obj.setSalary(obj.getSalary() + 5000); return obj;} ).collect(Collectors.toList());
		empList.forEach(obj -> System.out.println(obj));
		
		int no [] = {12, 21, 32, 45, 52, 63};
        Arrays.stream(no)
            .filter(n -> n%3 == 0)
            .map(n -> ++n)
            .filter(n -> n%8 == 0)
            .forEach(System.out::println);
	}

}

class Employee13 {
	private String name;
	private int empId;
	private int yearsOfExp;
	private int salary;
	Employee13(String name, int id, int exp, int salary) {
		this.name = name;
		empId = id;
		yearsOfExp = exp;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(int yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Name : " + getName() + " Salary : " + salary + " | ";
	}
	
}
