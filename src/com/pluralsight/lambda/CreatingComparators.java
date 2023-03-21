package com.pluralsight.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingComparators {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("one", "two", "three", "four", "five", "six");
		List<String> strings = stream.collect(Collectors.toList());

		Comparator<String> cmp1 = (s1, s2) -> s1.compareTo(s2);
		strings.sort(cmp1);
		System.out.println(strings);

//		Comparator<String> cmp2 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
//		Function<String, Integer> toLength = s -> s.length();
		ToIntFunction<String> toLength = s -> s.length();
		Comparator<String> cmp2 = Comparator.comparingInt(toLength);
		strings.sort(cmp2);
		System.out.println(strings);
	}
}
