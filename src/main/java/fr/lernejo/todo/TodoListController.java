package fr.lernejo.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoListController {

    public ArrayList<Todo> todoList = new ArrayList<Todo>();

    @PostMapping("api/todo")
    public void addTodo(Todo todo) {
        this.todoList.add(todo);
    }

    @GetMapping("api/todo")
    public ArrayList<Todo> getTodoList() {
        return this.todoList;
    }
}
