package annotations.examples;

public class OverrideAnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Professor vp = new VisitingProfessor();
//		System.out.println(vp.getSalary());
		Customer cust = new DiamondCustomer();
		cust.calculateAmount(100);

	}

}

//class Professor {
//	public int getSalary() {
//		return 50000;
//	}
//}
//
//class VisitingProfessor extends Professor {
//	@Override
//	public int getSalary() {
//		return 30000;
//	}
//}

class Customer {
	
	public void calculateAmount(int amount){
		System.out.println("the total amount");
		
	}
 
}
 
class DiamondCustomer extends Customer{
	@Override
	public void calculateAmount(int amount){
		System.out.println("the total amount for diamond !");
		
	}
 
}
