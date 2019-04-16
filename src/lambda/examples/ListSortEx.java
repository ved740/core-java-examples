package lambda.examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> empList = new ArrayList<>();
		empList.add(new Employee1("101"));
		empList.add(new Employee1("103"));
		empList.add(new Employee1("105"));
		empList.add(new Employee1("102"));
		empList.sort(new EmployeeComparator());
		System.out.println(empList);

	}

}

class Employee1 {
	private String empNo;
	Employee1(String empNo){
		this.empNo = empNo;
	}
	public String getEmpNo() {
		return empNo;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empNo;
	}
}

class EmployeeComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.getEmpNo().compareTo(o2.getEmpNo());
	}
	
}
