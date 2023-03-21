package com.pluralsight.lambda.user;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserComparator {
	public static void main(String[] args) {
		User sarah = new User("Sarah", 28);
		User james = new User("John", 35);
		User mary = new User("Mary", 33);
		User john = new User("John", 24);

		Stream<User> stream = Stream.of(sarah, james, mary, john);
		List<User> users = stream.collect(Collectors.toList());

		Comparator<User> cmpName = Comparator.comparing(user -> user.getName());
		Comparator<User> cmpAge = Comparator.comparing(user -> user.getAge());
		Comparator<User> comparator = cmpName.thenComparing(cmpAge);
		users.sort(comparator);
//		Comparator<User> reversed = comparator.reversed();
//		users.sort(reversed);
		users.forEach(user -> System.out.println(user));
	}
}
