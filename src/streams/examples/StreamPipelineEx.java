package streams.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee12> empList = Arrays.asList(new Employee12("Ved", 101, 5), new Employee12("Vikash", 102, 1), new Employee12("Chandan", 10002, 3));
		Stream<Employee12> empStream = empList.stream();
//		Stream<Employee12> recentAndSorted = 
		empStream.filter(emp -> emp.getYearsOfExp() < 4).sorted((a, b) -> a.getEmpId() - b.getEmpId()).forEach(item -> System.out.println(item));
		
		int no [] = { 11,22,33,44,55,66};
        Arrays.stream(no)
            .filter(n -> n%3 == 0 || n%5 == 0)
            .forEach(System.out::print);

	}

}

class Employee12 {
	private String name;
	private int empId;
	private int yearsOfExp;
	Employee12(String name, int id, int exp) {
		this.name = name;
		empId = id;
		yearsOfExp = exp;
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
	public String toString() {
		return "Name : " + getName() + " ";
	}
	
}
