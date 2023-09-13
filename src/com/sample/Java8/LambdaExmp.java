package com.sample.Java8;

public class LambdaExmp {
	
	public static void main(String[] args) 
	{
		SumInterface sum = (x,y) -> x+y;
		int result = sum.sum(3,4);
		System.out.println("The sum of two number is : " + result);
		
	}

}
