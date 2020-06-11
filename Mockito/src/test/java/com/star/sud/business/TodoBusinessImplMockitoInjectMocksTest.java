package com.star.sud.business;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.star.sud.api.TodoService;

//@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMockitoInjectMocksTest {

	@Rule
	public MockitoRule MockitoRule = MockitoJUnit.rule();

	@Mock
	TodoService todoServiceMock;

	@InjectMocks
	TodoBusinessImpl businessImpl;

	@Captor
	ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);

	@Test
	public void retriveTodosRelatedToSpringTest_usingBasic() {
		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		when(todoServiceMock.retriveTodos("Spring")).thenReturn(asList);
		List<String> todos = businessImpl.retriveTodosRelatedToSpring("Spring");
		assertEquals(2, todos.size());
	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArray() {
		List<String> asList = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
		when(todoServiceMock.retriveTodos("Spring")).thenReturn(asList);
		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");
		List<String> expected = Arrays.asList("Learn Spring Framework", "Learn Spring Cloud");
		assertArrayEquals(expected.toArray(), retriveTodosRelatedToSpring.toArray());
	}

	@Test
	public void retriveTodosRelatedToSpringTest_usingArrayEmpty() {
		List<String> asList = Arrays.asList();
		when(todoServiceMock.retriveTodos("Spring")).thenReturn(asList);
		List<String> retriveTodosRelatedToSpring = businessImpl.retriveTodosRelatedToSpring("Spring");
		assertEquals(0, retriveTodosRelatedToSpring.size());
	}

}
