package Client;

import Component.Todo;
import Composite.TodoComposite;
import Leaf.TodoLeaf;

public class Main {
    public static void main(String[] args) {

        Todo todoLeaf = new TodoLeaf();
        todoLeaf.doOperation();

        TodoComposite todoComposite = new TodoComposite();
        TodoComposite subTodoComposite = new TodoComposite();

        todoComposite.addTodo(new TodoLeaf());
        subTodoComposite.addTodo(new TodoLeaf());
        todoComposite.addTodo(subTodoComposite);

        todoComposite.doOperation();

    }
}
