package datetimeapi.examples;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class OldUtilDateAPIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		OLD CODE COMMENTED
		/*Date date = new Date();
		date.setDate(9);
		date.setMonth(11);
		date.setYear(2016);
		System.out.println(date);*/
		
		/* Implemented date generation using java.time api */
		LocalDate lDate = LocalDate.of(2016, Month.APRIL, 9);
		System.out.println(lDate);

	}

}
