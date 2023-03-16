package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {

	public static void main(String[] args) {
		
	LocalDate today = LocalDate.now();//여기까지 결과값은 2023-03-09
		
		System.out.println(LocalDate.now()); 
		System.out.println(LocalTime.now()); 
		System.out.println(LocalDateTime.now()); 
		
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue()); // 월 1~12
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());

	}

}
