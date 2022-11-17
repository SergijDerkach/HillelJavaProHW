package hw10_1;

import hw8.CollectionServiseImp;

public class HomeWork10 {


    public static void main(String[] args) {
        CollectionServiseImp coll = new CollectionServiseImp();

        coll.add("1");
        coll.add("22");
        coll.add(1,"3");
        coll.add("4");
        coll.add(3,"5");

        DerIterator dItertor = new DerIterator(coll.getStrs());
        int count = 0;
        while (dItertor.hasNext()&&count<coll.size()){
            count++;
            String str =(String) dItertor.next();
            System.out.print(str+",");
        }
    }
}
