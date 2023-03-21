package com.pluralsight.lambda;

@FunctionalInterface // not mandatory as long as interface has only 1 method
public interface FunctionalDemo {

	String get();

	// can contain default and static methods
}
