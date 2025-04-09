package com.example.TodoAPIspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	public static List<Todo> todoList;
	
	public TodoController() {
		
		todoList = new ArrayList<>();
		
		todoList.add(new Todo(1, false, "Task 1", 001));
		todoList.add(new Todo(2, false, "Task 1", 002));
	}
	
	@GetMapping("/todos")
	public List<Todo> getTodoList(){
		
		return todoList;
	}
	
	@PostMapping("/todos")
	public Todo createTodo(@RequestBody Todo newTodo) {
		
		todoList.add(newTodo);
		return newTodo;
	}
}


