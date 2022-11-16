package hw9;

import hw8.CollectionServiseImp;

public class LinkList {

    public static void main(String[] args) {
        CunstomCollectionImp list = new CunstomCollectionImp();
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("11");
        coll.add("22");
        coll.add("33");
        coll.add("44");



        list.add("2");
        list.add("1");
        list.add("#");
        list.add("#3");
        list.add("#1");
        list.add("#6");

        list.displayList();
        System.out.println("size: " +list.size());

        list.delete(3);

        list.displayList();
        System.out.println("size: " +list.size());
        System.out.println(list.get(5));

        list.contains("#1");
        System.out.println("");
        System.out.println("-----------------------");


        list.addAll(coll);
        list.displayList();

    }

}
