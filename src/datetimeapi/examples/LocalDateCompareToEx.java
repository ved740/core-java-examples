package datetimeapi.examples;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateCompareToEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate from = LocalDate.of(2016, Month.JUNE, 01);
		LocalDate to = LocalDate.of(2016, Month.JUNE, 03);
		AdvanceSalary1 as1obj = new AdvanceSalary1(from, to);
		as1obj.checkDates();
		
		LocalDate parsedDate = LocalDate.parse("2018-11-18");
		System.out.println(parsedDate);
	}

}

class AdvanceSalary1 {
	private LocalDate from;
	private LocalDate to;
	public AdvanceSalary1(LocalDate from, LocalDate to) {
		// TODO Auto-generated constructor stub
		this.from = from;
		this.to = to;
	}
	public LocalDate getFrom() {
		return from;
	}
	public void setFrom(LocalDate from) {
		this.from = from;
	}
	public LocalDate getTo() {
		return to;
	}
	public void setTo(LocalDate to) {
		this.to = to;
	}
	public void checkDates() {
		int compare = from.compareTo(to);
		System.out.println(compare);
	}
	
}
