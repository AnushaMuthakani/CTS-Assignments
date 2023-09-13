package com.sample.Java8;

import java.util.function.Function;

public class FunctionalInterfaceStrConversion {

	public static void main(String[] args) {
		Function<String, String> function = s->s.toLowerCase();
		System.out.println(" The converted string to lower case is :" + function.apply("HI"));
	}
}
