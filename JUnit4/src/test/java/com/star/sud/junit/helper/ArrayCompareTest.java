package com.star.sud.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void compareArraySort_RandomArray() {
		int[] numbers = { 5, 2, 4, 1, 3 };
		int[] sorted = { 1, 2, 3, 4, 5 };
		Arrays.sort(numbers);

		assertArrayEquals(sorted, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = null;
		Arrays.sort(numbers);
	}

	@Test(timeout = 1000)
	public void testArray_Performance() {
		for (int i = 0; i <= 10000; i++) {
			System.out.println(i);
		}
	}

}
