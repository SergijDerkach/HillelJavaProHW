package com.hillel;

import service.imp.CollectionServiseImp;
import service.imp.DerIterator;

public class Collection {
    public static void main(String[] args) {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("1");
        coll.add("22");
        coll.add(1,"3");
        coll.add("4");
        coll.add(3,"5");
        coll.displayColl();
        System.out.println("");
        System.out.println(coll.size());

        coll.delete("3");
        coll.displayColl();
        System.out.println("");
        System.out.println(coll.size());

        System.out.println(coll.get(6));

        System.out.println("");
        System.out.println(coll.size());

        System.out.println(coll.contains("2"));
        System.out.println(coll.get(2).equals("2"));

        DerIterator iterator = new DerIterator(coll.getStrs());
        iterator.go();
        System.out.println("---");

        System.out.println(coll.clear());
        System.out.println(coll.size());
        coll.displayColl();
    }
}
