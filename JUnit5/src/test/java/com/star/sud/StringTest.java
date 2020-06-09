package com.star.sud;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class StringTest {

	private String str;

	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}

	@BeforeEach // @Before - JUnit4
	void beforeEach(TestInfo info) {
		System.out.println("Initialize test  data for - " + info.getDisplayName());
	}

	@AfterEach // @After - JUnit4
	void afterEach(TestInfo info) {
		System.out.println("After Each - " + info.getDisplayName());
	}

	@Test
	void test() {
		int expected = 4;
		assertEquals(expected, "ABCD".length());
	}

	@Test
	void testLenght() {
		assertEquals("SUDARSHAN", "sudarshan".toUpperCase());
		assertEquals("test", "Test".toLowerCase());
	}

	@Test
	void containsBasic() {
		assertTrue("abcd".contains("abcd"));
		assertFalse("abcd".contains("iydd"));
	}

	@Test
	void testArray() {
		String str = "welcome to spring";
		String[] actual = str.split(" ");
		String[] expected = { "welcome", "to", "spring" };
		assertArrayEquals(expected, actual);
	}

	@SuppressWarnings("null")
	@Test
	@DisplayName("When  length is null, throw exception")
	void lenght_Exception() {
		String str = null;
		assertThrows(NullPointerException.class, () -> {
			str.length();
		});
	}

	@Test
	void lengthGreterThanZero() {
		assertTrue("ABC".length() > 0);
		assertTrue("A".length() > 0);
		assertTrue("RTYU".length() > 0);
		assertTrue("BB".length() > 0);
	}

	@ParameterizedTest
	@ValueSource(strings = { "ABC", "A", "RTYU", "BB" })
	void parameterizedTest(String msg) {
		assertTrue(msg.length() > 0);
	}

	@ParameterizedTest(name = "{0} upper case is {1}")
	@CsvSource(value = { "abcd, ABCD", "abc, ABC", "'',''", "abcdef,ABCDEF" })
	void uppercase(String world, String capitalizedWord) {
		assertEquals(capitalizedWord, world.toUpperCase());
	}

	@ParameterizedTest(name = "{0} lenght is {1}")
	@CsvSource(value = { "abcd, 4", "abc, 3", "'', 0", "abcdef,6" })
	void length(String world, int expectedLen) {
		assertEquals(expectedLen, world.length());
	}

	@Test
	@RepeatedTest(10)
	void repeatedExecution() {
		assertFalse("abcdefg".contains("mnop"));
	}

	@Test
	@Disabled
	void performanceTest() {
		assertTimeout(Duration.ofSeconds(5), () -> {
			for (int i = 0; i < 1000000; i++) {
				System.out.println(i);
			}
		});
	}

	@Nested
	@DisplayName("Nested Function")
	class StringNestedTests {

		@BeforeEach
		void preload() {
			str = "";
		}

		@Test
		@DisplayName("Lenght is Zero")
		void lengthTest() {
			assertEquals(0, str.length());
		}

		@Test
		@DisplayName("Upper Case is empty")
		void upperCaseIsEmpty() {
			assertEquals("", str.toUpperCase());
		}

	}

	@Nested
	class LargeStringTest {

		@BeforeEach
		void preload() {
			str = "asdfghjklqwertyuiopzxcvbnm";
		}

		@Test
		void testLenghtLarge() {
			assertTrue(str.length() > 20);
		}

		@Test
		void testLenghtNotEmpty() {
			assertFalse(str.length() == 0);
		}

	}

}
