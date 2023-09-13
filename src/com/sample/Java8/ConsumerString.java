package com.sample.Java8;
import java.util.function.Consumer;

public class ConsumerString {

	public static void main(String[] args) {
		Consumer<String> consumer = System.out::println;
		consumer.accept("Hi user");
	}
}
