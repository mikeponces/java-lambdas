package com.pluralsight.lambda;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambdas {
	public static void main(String[] args) {
		IntSupplier supplier = () -> 10;
		int i = supplier.getAsInt();
		System.out.println(i);

		// I want a function to take a Double and return an Int
		DoubleToIntFunction function = value -> (int) Math.floor(value);
		int pi = function.applyAsInt(Math.PI);
		System.out.println(pi);
	}
}
