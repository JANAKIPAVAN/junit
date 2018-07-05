package com.mock.business;



import java.util.ArrayList;
import java.util.List;

import com.mock.TodoService;

public class TodoBusinessImpl {
	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedtoSpring(String user){
List<String> filteredTodos =new ArrayList<String>();
List<String> todos = todoService.retrieveTodos(user);
for(String todo:todos) {
	if(todo.contains("Spring")) {
		filteredTodos.add(todo);
	}
}
return filteredTodos;
	}
	

}
