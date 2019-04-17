package datetimeapi.examples;

import java.time.LocalDate;

public class LocalDateCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		At the time of registration 
		LocalDate regDate = LocalDate.now();
		LocalDate proposedLastDate = regDate.plusDays(3);
		
//		At the time of checking
		if(LocalDate.now().isAfter(proposedLastDate)) {
			System.out.println("Complete the course ASAP !!");
		}
		
	}

}
