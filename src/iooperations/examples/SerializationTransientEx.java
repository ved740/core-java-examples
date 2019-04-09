package iooperations.examples;

import java.io.*;
import java.io.Serializable;

public class SerializationTransientEx {
	public static void main(String args[]) throws Exception {
		Account01A account = new Account01A("FinanceIndia","20345678");
	   ObjectOutputStream objOutStream = new ObjectOutputStream(
	                     new FileOutputStream("account.dat"));
	   objOutStream.writeObject(account);
	   ObjectInputStream objInStream = new ObjectInputStream(
		                 new FileInputStream("account.dat"));
	   Account01A accountRead = (Account01A )objInStream.readObject();
	   System.out.println(accountRead);
	   objOutStream.close();
	   objInStream.close();
	}
}


class Account01A implements Serializable{
	private String accountName;
	private transient String accountNo;
	public String bankName  ;
	
	public Account01A(String accountName, String accountNo) {
		this.accountName = accountName;
		this.accountNo = accountNo;
		bankName = "BankIndia" ;
	}
	
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNo=" + accountNo + 
				", bankName=" + bankName +"]";
	}
}
