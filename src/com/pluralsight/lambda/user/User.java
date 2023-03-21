package com.pluralsight.lambda.user;

public class User {

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	private String name;
	private int age;

	public User(String name) {
		this.name = name;
	}

	public User(String name, int age) {
		this(name);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}