package datetimeapi.examples;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("System zone time : " + ZonedDateTime.now());
		System.out.println("Europe/Athens Time : " + ZonedDateTime.now(ZoneId.of("Europe/Athens")));

	}

}
