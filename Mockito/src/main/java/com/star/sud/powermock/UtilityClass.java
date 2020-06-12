package com.star.sud.powermock;

public class UtilityClass {
	static int staticMethod(long value) {
		// complex login here
		throw new RuntimeException("Run time exception");
	}
}