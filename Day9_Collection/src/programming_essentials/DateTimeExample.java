package programming_essentials;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeExample {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalTime current = LocalTime.now();
		LocalDateTime timestamp = LocalDateTime.now();
		System.out.println(today);
		System.out.println(current);
		System.out.println(timestamp);
		System.out.println("======================================");
		LocalDate newYearDay = LocalDate.of(2026, 01, 01);
		System.out.println(newYearDay);
		LocalDate tomorrow =  today.plus(1, ChronoUnit.DAYS);
		System.out.println(tomorrow);
		LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
		System.out.println(yesterday);
		
	}
}
