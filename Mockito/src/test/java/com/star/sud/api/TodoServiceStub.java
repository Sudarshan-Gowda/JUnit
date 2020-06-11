package com.star.sud.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	public List<String> retriveTodos(String user) {

		return Arrays.asList("Learn Spring Framework", "Learn Spring Cloud", "Learn Cloud Techies");
	}

	public List<String> deleteTodo(String todo) {
		return null;
	}

}
