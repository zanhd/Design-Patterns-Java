package Composite;

import Component.Todo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class TodoComposite implements Todo {
    List<Todo> nodes = new ArrayList<>();

    public void addTodo(Todo todo) {
        nodes.add(todo);
    }

    public void removeTodo(Todo todo) {
        nodes.remove(todo);
    }

    @Override
    public void doOperation() {
        for(Todo todo : nodes) {
            todo.doOperation();
        }
    }
}
