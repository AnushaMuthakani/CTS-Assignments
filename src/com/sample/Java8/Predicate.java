package com.sample.Java8;


import java.util.Arrays;
import java.util.List;

public class Predicate {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		condition(list, (n) -> n%2 ==0);
		
	}

	public static void condition(List<Integer> list, java.util.function.Predicate<Integer> predicate) {
		for(Integer n : list) {
			if(predicate.test(n)) {
				System.out.println(n + " ");
			}
		}
	}
}
