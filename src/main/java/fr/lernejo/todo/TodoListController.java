package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {

    public ArrayList<Todo> todoList;

    @PostMapping("api/todo")
    public void addTodo(Todo todo) {
        todoList.add(todo);
    }

    @GetMapping("api/todo")
    public ArrayList<Todo> getTodoList () {
        return todoList;
    }
}
