package datetimeapi.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OldUtilDateReadFromStringEx {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		EmployeeServiceR empSer = new EmployeeServiceR();
		Long lops = empSer.calculateLOPs("12/04/2019", "16/04/2019");
		System.out.println(lops);

	}

}

class EmployeeServiceR {
    public static long calculateLOPs(String startDateLOP, String endDateLOP) throws ParseException {
        SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
        Date start = formatt.parse(startDateLOP);
        Date end = formatt.parse(endDateLOP);
        long diff = end.getTime() - start.getTime();    // Difference in milliseconds
        long lops = diff / (24 * 60 * 60 * 1000);       // Converting milliseconds to days
        return lops + 1;
    }
}
