package com.star.sud.business;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class HamcrestMatchersTest {

	@Test
	public void test() {

		// Numbers
		List<Integer> scores = Arrays.asList(3, 8, 4, 5, 6);
		assertThat(scores, hasSize(5));
		assertThat(scores, hasItems(3, 8));
		assertThat(scores, everyItem(greaterThan(2)));
		assertThat(scores, everyItem(lessThan(10)));

		// String
		assertThat("", isEmptyString());
		assertThat(null, isEmptyOrNullString());

		// Arrays
		Integer[] marks = { 1, 2, 3, 4 };
		assertThat(marks, arrayWithSize(4));
		assertThat(marks, arrayContaining(1,2,3,4));
		assertThat(marks, arrayContainingInAnyOrder(4,1,2,3));
		

	}

}
