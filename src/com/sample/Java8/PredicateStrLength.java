package com.sample.Java8;

import java.util.function.Predicate;
public class PredicateStrLength {

	public static void main(String[] args) {
		Predicate<String> stringLength = s -> s.length() > 5;
		boolean value = stringLength.test(" How are you?");
		System.out.println("The given string length is greater than 5 is : " + value);
		
	}
}
