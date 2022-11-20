package hw10_1;

import hw8.CollectionServiseImp;
import hw8.DerIterator;

import java.util.ArrayList;

public class HomeWork10 {

    public static void main(String[] args) {
        CollectionServiseImp coll = new CollectionServiseImp();

        coll.add("1");
        coll.add("22");
        coll.add(1,"3");
        coll.add("4");
        coll.add(3,"5");


        System.out.println("");
        ArrayList<Object> dColl = new ArrayList<Object>();
        UniqueVal opObj = new UniqueValImp();

        dColl.add(2);
        dColl.add(1);
        dColl.add(3);
        dColl.add(4);
        dColl.add(2);
        dColl.add(5);
        dColl.add(5);

        System.out.println((ArrayList<Object>) opObj.retUnval(dColl));
    }
}
