package com.star.sud.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.stub;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void mockTest1() {
		List arrayListMock = mock(ArrayList.class);
		assertEquals(0, arrayListMock.size());
	}

	@Test
	public void mockTest2() {
		List arrayListMock = mock(ArrayList.class);
		stub(arrayListMock.size()).toReturn(5);
		assertEquals(5, arrayListMock.size());
	}

	@Test
	public void mockTest3() {
		List arrayListMock = mock(ArrayList.class);
		assertEquals(0, arrayListMock.size());
		stub(arrayListMock.size()).toReturn(5);
		assertEquals(5, arrayListMock.size());
	}

	/**
	 * adding new data the list will not affect since we are using mock, if we add
	 * some value also treated as dummy add
	 */
	@Test
	public void mockTest4() {
		List arrayListMock = mock(ArrayList.class);
		assertEquals(0, arrayListMock.size());
		arrayListMock.add("Test");// added to check is it really affect the list
		stub(arrayListMock.size()).toReturn(5);
		assertEquals(5, arrayListMock.size());
	}

	// now if we want to really use the list and want to do certain track of the
	// list or if we want to override certain things, then we should go for the spy
	// instead of mock

	/**
	 * We tried to change the list by adding the elements for the spy list, original
	 * list will get affected
	 */
	@Test
	public void spyTest1() {
		List arraySpy = spy(ArrayList.class);
		assertEquals(0, arraySpy.size());
		arraySpy.add("Test");
		assertEquals(1, arraySpy.size());
	}

	@Test
	public void spyTest2() {
		List arraySpy = spy(ArrayList.class);
		stub(arraySpy.size()).toReturn(5);
		assertEquals(5, arraySpy.size());
	}

	@Test
	public void spyTest() {
		List arraySpy = spy(ArrayList.class);
		arraySpy.add("Hello");
		verify(arraySpy).add("Hello"); // verify the add is called or not
		verify(arraySpy, never()).clear(); // verify the clear method never called
	}

}
