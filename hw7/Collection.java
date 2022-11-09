package hw7;

public class Collection {
    private String [] coll;
    private int count = 0;
    private static final int  defSize = 5;
    private static int size;
    public Collection(){
        this.coll = new String [defSize];
    }

    public static void main(String[] args) {
        Collection coll = new Collection();
        coll.add(0,"0");
        coll.add("1");
        coll.add(1,"2");
        coll.add(3,"3");
        coll.add("4");
        coll.add("5");

        System.out.println("");
        coll.add(4,"6");
        coll.add(5,"7");
        coll.add(6,"7");
        coll.add(7,"7");
        for(int i = 0; i<size;i++){
            System.out.print(coll.coll[i]);
        }
        System.out.println("");
        coll.delete(5);
        coll.delete("7");
        for(int i = 0; i<size;i++){
            System.out.print(coll.coll[i]);
        }
    }

    private boolean add(int index, String value){

        if(coll.length - size == 2 ){
            coll = increaseArray();
        }

        if(coll[index] == null){
            coll[index] = value;
            size++;
            return true;
        }else {
            String t = coll[size-1];
            coll[index] = value;
            coll[size] = t;
            size++;
            return true;
        }
    }
    private boolean add(String value){
        if(size == coll.length){
            coll = increaseArray();
        }
        coll[size]= value;
        size++;
        return true;
    }
    private boolean delete(int index){
        if(checkIndex(index)){
            coll[index] = null;
            for(int i = index; i<size;i++){
                coll[i] = coll[i+1];
            }
            size--;
            return true;
        }
        return false;
    }
    private  boolean delete(String value){
        int tIndex = 0;
        for(int i = 0; i<size;i++){
            if(coll[i].equals(value)){
                tIndex = i;
                break;
            }
        }
        coll[tIndex] = null;
        for(int i = tIndex; i<size;i++){
            coll[i] = coll[i+1];
        }
        size--;
        return true;
    }
    private String get(int index){
        return coll[index];
    }
    private String [] increaseArray(){
        String [] t = new String[(int) ((coll.length * 1.6) + 1)];
        System.arraycopy(coll,0,t,0,coll.length);
        return t;
    }
    private boolean checkIndex(int index){
        if(index >= size && index < 0){
            return false;
        }
        return true;
    }
}
