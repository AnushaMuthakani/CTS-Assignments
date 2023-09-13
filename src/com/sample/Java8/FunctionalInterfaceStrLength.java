package com.sample.Java8;

import java.util.function.Function;
public class FunctionalInterfaceStrLength {

	public static void main(String[] args) {
		Function<String, Integer> function = s->s.length();
		System.out.println(" The string length is : " + function.apply("Hi"));
	} 
}
