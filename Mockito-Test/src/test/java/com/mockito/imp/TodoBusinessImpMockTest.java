package com.mockito.imp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.mock.TodoService;
import com.mock.business.TodoBusinessImpl;

public class TodoBusinessImpMockTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAMock() {
		TodoService todoServiceMock= mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring mvc","Learn Spring", "Learn to dance");
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Dummy");
	assertEquals(2,filteredTodos.size());
	}
	@Test
	public void testRetrieveTodosRelatedToSpring_withEmptyList() {
		TodoService todoServiceMock= mock(TodoService.class);
		List<String> todos = Arrays.asList();
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
	List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedtoSpring("Dummy");
	assertEquals(0,filteredTodos.size());
	}

}
