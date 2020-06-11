package com.star.sud.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import com.star.sud.api.TodoService;

public class TodoBusinessImplBDDMockitoTest {

	// BDD Implementation follows
	// 01- Given
	// 02- When
	// 03- Then

	@Test
	public void retriveTodosRelatedToSpringTest_usingBasic() {

		// 01- Given
		TodoService todoService = mock(TodoService.class);

		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		// when(todoService.retriveTodos("Spring")).thenReturn(asList);
		given(todoService.retriveTodos("Spring")).willReturn(asList);

		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);

		// 02- When
		List<String> todos = businessImpl.retriveTodosRelatedToSpring("Spring");

		// 03- Then
		assertThat(todos.size(), is(2));
	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArray() {
		// Given
		TodoService todoService = mock(TodoService.class);
		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		given(todoService.retriveTodos("Spring")).willReturn(asList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);

		// When
		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");
		List<String> expected = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud");

		// Then
		assertArrayEquals(expected.toArray(), retriveTodosRelatedToSpring.toArray());

	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArrayEmpty() {
		// Given
		TodoService todoService = mock(TodoService.class);
		List<String> asList = Arrays.asList();
		given(todoService.retriveTodos("Spring")).willReturn(asList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		// When
		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");
		// Then
		assertThat(retriveTodosRelatedToSpring.size(), is(0));
	}

	@Test
	public void testDeleteTodosNotRelatedToSpring_usingBDD() {
		// Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		given(todoServiceMock.retriveTodos("Dummy")).willReturn(asList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceMock);

		// When
		businessImpl.deleteTodosNotRelatedToSpring("Dummy");

		// Then
		verify(todoServiceMock).deleteTodo("Learn Cloud Techies");// Verify the method called or not

		verify(todoServiceMock, never()).deleteTodo("Learn Spring Framework"); // never() - never called

		verify(todoServiceMock, times(1)).deleteTodo("Learn Cloud Techies"); // times(1) - number of times method called

		verify(todoServiceMock, atLeastOnce()).deleteTodo("Learn Cloud Techies"); // atLeastOnce() - called at least
																					// once

	}

	@Test
	public void testDeleteTodosNotRelatedToSpring_usingBDD_Arguments() {

		// Declare
		// Define
		// Capture
		ArgumentCaptor<String> stArgumentCaptor = ArgumentCaptor.forClass(String.class);

		// Given
		TodoService todoServiceMock = mock(TodoService.class);
		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		given(todoServiceMock.retriveTodos("Dummy")).willReturn(asList);
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoServiceMock);

		// When
		businessImpl.deleteTodosNotRelatedToSpring("Dummy");

		// Then
		verify(todoServiceMock).deleteTodo(stArgumentCaptor.capture());// Verify the method called or not
		assertThat(stArgumentCaptor.getValue(), is("Learn Cloud Techies"));
	}
	
	 
}
