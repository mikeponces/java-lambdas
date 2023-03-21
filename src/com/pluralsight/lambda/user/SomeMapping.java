package com.pluralsight.lambda.user;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
	public static void main(String[] args) {
		User sarah = new User("Sarah");
		User james = new User("James");
		User mary = new User("Mary");
		User john = new User("John");

		List<User> users = List.of(sarah, james, mary, john);
		List<String> names = new ArrayList<>();

		Function<User, String> toName = user -> "Hi! I'm" + user.getName();
		users.forEach(user -> names.add(toName.apply(user)));
		names.forEach(name -> System.out.println(name));
	}
}
