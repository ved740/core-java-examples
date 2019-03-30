
public class Account {
	private double balance = 1000;
	public double getBalance(int accountId) {
		return balance;
	}
	public static void main(String[] args) {
		Account accnt = new Account();
		double value = accnt.getBalance(1234);
		System.out.println("The balance is : " + value);
	}
}
