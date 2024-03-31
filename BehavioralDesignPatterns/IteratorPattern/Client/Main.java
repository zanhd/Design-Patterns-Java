package Client;

import Aggregate.ConcreateAggregate;
import Iterator.Iterator;

public class Main {

    public static void main(String[] args) {
        ConcreateAggregate aggregate = new ConcreateAggregate();
        aggregate.addItem(1);
        aggregate.addItem(2);
        aggregate.addItem(3);

        Iterator iterator = aggregate.createIterator();
        while(iterator.hasNext()) {
            Integer item = (Integer) iterator.next();
            System.out.println("Item : " + item);
        }
    }
}
