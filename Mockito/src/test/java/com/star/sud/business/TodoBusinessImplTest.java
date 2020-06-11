package com.star.sud.business;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.star.sud.api.TodoService;
import com.star.sud.api.TodoServiceStub;

public class TodoBusinessImplTest {

	@Test
	public void retriveTodosRelatedToSpringTest_usingStub() {

		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = businessImpl.retriveTodosRelatedToSpring("Spring");
		assertEquals(2, todos.size());

	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArray() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl businessImpl = new TodoBusinessImpl(todoService);

		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");

		List<String> expected = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud");
		assertArrayEquals(expected.toArray(), retriveTodosRelatedToSpring.toArray());

	}
	
}
