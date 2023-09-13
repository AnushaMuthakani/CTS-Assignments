package com.sample.Java8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDateAndTime {
 
	static DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyy-mm-dd HH:mm:ss");
	public static void main(String[] args) {
		Supplier<String> s1 = () -> dateTime.format(LocalDateTime.now());
		String time2 = s1.get();
		System.out.println(time2);
		
	}
}
