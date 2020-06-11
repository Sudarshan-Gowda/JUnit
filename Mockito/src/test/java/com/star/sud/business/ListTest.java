package com.star.sud.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		List list = mock(List.class);
		assertEquals(0, list.size());
	}

	@Test
	public void test1() {
		List list = mock(List.class);
		when(list.size()).thenReturn(2);
		assertEquals(2, list.size());
	}

	@Test
	public void test2() {
		List list = mock(List.class);
		when(list.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, list.size());
		assertEquals(3, list.size());
	}

	@Test
	public void test3() {
		List list = mock(List.class);
		when(list.get(0)).thenReturn("welcome");
		assertEquals("welcome", list.get(0));
		assertEquals(null, list.get(1));
	}

	@Test
	public void test4() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenReturn("welcome");
		assertEquals("welcome", list.get(0));
		assertEquals("welcome", list.get(1));
	}

	@Test(expected = RuntimeException.class)
	public void test5() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenThrow(new RuntimeException());
		list.get(0);
	}
	
	@Test
	public void test6() {
		List list = mock(List.class);
		when(list.get(anyInt())).thenReturn(anyObject());
		assertEquals(null, list.get(0));
	}

}
