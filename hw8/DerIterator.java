package hw8;

import java.util.Iterator;

public class DerIterator implements Iterator {
    private String[] strs;
    private int index = 0;

    DerIterator(String[] strs){
        this.strs = strs;
    }

    @Override
    public boolean hasNext() {
        return index< strs.length;
    }

    @Override
    public Object next() {
        return strs[index++];
    }

    public void go(){
        int count = 0;
        while (hasNext()){
            count++;
            String str =(String) next();
            System.out.print(str+",");
        }

        System.out.println("");
    }
}
