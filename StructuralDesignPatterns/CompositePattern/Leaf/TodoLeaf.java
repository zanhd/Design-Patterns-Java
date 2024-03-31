package Leaf;

import Component.Todo;

public class TodoLeaf implements Todo {
    @Override
    public void doOperation() {
        System.out.println("Marked As DONE");
    }
}
