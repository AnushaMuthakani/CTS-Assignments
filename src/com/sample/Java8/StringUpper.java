package com.sample.Java8;

import java.util.Arrays;
import java.util.List;

public class StringUpper {
 
	 public static void main(String[] args) {
		 List<String> list = Arrays.asList("a1", "a2","b1","b2");
		 list.stream().map(String::toUpperCase).forEach(System.out::println);
		 
	 }
}
