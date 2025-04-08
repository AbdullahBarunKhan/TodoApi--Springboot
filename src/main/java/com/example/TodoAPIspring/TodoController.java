package com.example.TodoAPIspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

	public static List<Todo> todo;
	
	public TodoController() {
		
		todo = new ArrayList<>();
		
		todo.add(new Todo(1, false, "Task 1", 001));
		todo.add(new Todo(2, false, "Task 1", 002));
	}
}
