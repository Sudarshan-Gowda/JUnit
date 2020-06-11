package com.star.sud.api;

import java.util.List;

public interface TodoService {

	public List<String> retriveTodos(String user);

	public List<String> deleteTodo(String todo);

}
