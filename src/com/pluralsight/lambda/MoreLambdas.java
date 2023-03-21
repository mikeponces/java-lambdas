package com.pluralsight.lambda;

import java.util.ArrayList;
import java.util.List;

public class MoreLambdas {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>(List.of("one", "two", "three"));

		strings.removeIf(s -> s.startsWith("t"));
		strings.forEach(s -> System.out.println(s));
	}
}
