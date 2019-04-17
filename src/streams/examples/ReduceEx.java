package streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Problem statemnet : Find emp having exp > 1; find emp having highest salary;
		
		List<Employee14> empList = Arrays.asList(new Employee14("Ved", 101, 5, 40000), 
				new Employee14("Atul", 102, 3, 30000), 
				new Employee14("Raj", 103, 8, 60000),
				new Employee14("SP", 104, 1, 70000));
		
		Optional<Integer> max = empList.stream().filter(emp -> emp.getYearsOfExp() > 1).map(emp -> emp.getSalary()).reduce(Integer::max);
		
		List<Employee14> maxEmpList = empList.stream().filter(emp -> emp.getSalary() == max.get()).collect(Collectors.toList());
		maxEmpList.forEach(emp -> System.out.println(emp));

	}

}

class Employee14 {
	private String name;
	private int empId;
	private int yearsOfExp;
	private int salary;
	Employee14(String name, int id, int exp, int salary) {
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
