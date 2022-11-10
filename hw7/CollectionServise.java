package hw7;

public class CollectionServise extends dCollection {
        public static void main(String[] args) {

            dCollection c = new dCollection();

            c.add(0,"1");
            c.add("1");
            c.add(1,"2");
            c.add(3,"3");
            c.add("4");
            c.add("5");

            System.out.println("");
            c.add(4,"6");
            c.add(5,"7");
            c.add(6,"7");
            c.add(7,"7");

            for(int i = 0; i<c.getSize(); i++) {
               System.out.print(c.coll[i]);
            }

            System.out.println("");
            c.delete(5);
            c.delete("7");

            for(int i = 0; i<c.getSize();i++){
                System.out.print(c.coll[i]);
            }
    }
}
