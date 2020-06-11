package com.star.sud.business;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.star.sud.api.TodoService;

public class TodoBusinessImplMockitoTest {

	@Test
	public void retriveTodosRelatedToSpringTest_usingBasic() {

		TodoService todoService = mock(TodoService.class);

		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		when(todoService.retriveTodos("Spring")).thenReturn(asList);

		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = businessImpl.retriveTodosRelatedToSpring("Spring");
		assertEquals(2, todos.size());

	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArray() {
		TodoService todoService = mock(TodoService.class);
		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		when(todoService.retriveTodos("Spring")).thenReturn(asList);

		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");

		List<String> expected = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud");
		assertArrayEquals(expected.toArray(), retriveTodosRelatedToSpring.toArray());

	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArrayEmpty() {
		TodoService todoService = mock(TodoService.class);
		List<String> asList = Arrays.asList();
		when(todoService.retriveTodos("Spring")).thenReturn(asList);

		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");

		assertEquals(0, retriveTodosRelatedToSpring.size());

	}

}
