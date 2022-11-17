package hw10_1;

import java.util.Iterator;

public class DerIterator implements Iterator {
    private Object[] objects;
    private int index=0;

    DerIterator(Object[] objects){
        this.objects = objects;
    }

    @Override
    public boolean hasNext() {
        return index< objects.length;
    }

    @Override
    public Object next() {
        return objects[index++];
    }
}
