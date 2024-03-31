package Iterator;

import Aggregate.ConcreateAggregate;

public class ConcreateIterator implements Iterator {

    private ConcreateAggregate aggregate;
    private int index = 0;

    public ConcreateIterator(ConcreateAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.size();
    }

    @Override
    public Object next() {
        return (hasNext()) ? aggregate.getItem(index++) : null;
    }
}
