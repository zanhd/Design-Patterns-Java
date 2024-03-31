package Aggregate;

import Iterator.Iterator;
import Iterator.ConcreateIterator;
import java.util.ArrayList;
import java.util.List;

public class ConcreateAggregate implements Aggregate {
    List<Integer> items = new ArrayList<>();

    public void addItem(Integer item) {
        items.add(item);
    }

    public Integer getItem(int index) {
        return items.get(index);
    }

    public Integer size() {
        return items.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreateIterator(this);
    }
}
