package com.star.sud.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void setUp() {
		System.out.println("Before test");
	}

	@After
	public void after() {
		System.out.println("After test");
	}

	@Test
	public void test1() {
		System.out.println("executing test1 method");
	}

	@Test
	public void test2() {
		System.out.println("executing test2 method");
	}

}
