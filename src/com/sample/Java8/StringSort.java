package com.sample.Java8;

import java.util.Arrays;
import java.util.List;

public class StringSort {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("b1", "a1","c2","c1");
		list.stream().sorted().forEach(System.out::println);
	}
}
