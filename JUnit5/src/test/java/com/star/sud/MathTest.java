package com.star.sud;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MathTest {

	@Test
	void min() {
		int exp = 4;
		int min = Math.min(4, 5);
		assertEquals(exp, min);
	}

	@Test
	void max() {
		int exp = 6;
		int min = Math.max(5, 6);
		assertEquals(exp, min);
	}

}
