package com.star.sud.business;

import java.util.ArrayList;
import java.util.List;

import com.star.sud.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<String> retriveTodosRelatedToSpring(String user) {

		List<String> filteredTodos = new ArrayList<String>();

		List<String> retriveTodos = todoService.retriveTodos(user);
		for (String todo : retriveTodos) {
			if (todo.contains("Spring"))
				filteredTodos.add(todo);
		}

		return filteredTodos;
	}

	public void deleteTodosNotRelatedToSpring(String todos) {

		List<String> retriveTodos = todoService.retriveTodos(todos);
		for (String todo : retriveTodos) {
			if (!todo.contains("Spring"))
				todoService.deleteTodo(todo);
		}
	}
	
}
