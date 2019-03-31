
public class VariableArgumentsEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("E11100");
		Employee emp2 = new Employee("E11101");
		System.out.println(emp1.getEmpId() + " has got " + emp1.reward(1000, 2000, 300, 120000) + " reward pints");
		System.out.println(emp2.getEmpId() + " has got " + emp2.reward(1000, 2000, 300) + " reward pints");
	}

}

class Employee {
	private String empId;
	Employee(String empId) {
		this.empId = empId;
	}
	public int reward(double...fixedDeposits) {
		int rewardPoints = 0;
		double sum = 0;
		for(double deposit:fixedDeposits) {
			sum += deposit;
		}
		if(sum > 20000) {
			rewardPoints = 200;
		} else {
			rewardPoints = 100;
		}
		return rewardPoints;
	}
	public String getEmpId() {
		return empId;
	}
}
