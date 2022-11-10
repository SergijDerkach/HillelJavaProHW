package hw7;

import java.util.Arrays;

public class dCollection {
    public String [] coll;
    private int count = 0;
    private final int  defSize = 5;
    private int size;

    public dCollection(){
        this.coll = new String [defSize];
        this.size = size;
    }
    public boolean add(int index, String value){

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
    public boolean add(String value){
        if(size == coll.length){
            coll = increaseArray();
        }
        coll[size]= value;
        size++;
        return true;
    }
    public boolean delete(int index){
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
    public  boolean delete(String value){
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
    public String get(int index){
        if(checkIndex(index)){
            return coll[index];
        }
        return "index outside the collection";
    }
    public String [] increaseArray(){
        String [] t = new String[(int) ((coll.length * 1.6) + 1)];
        System.arraycopy(coll,0,t,0,coll.length);
        return t;
    }
    public boolean checkIndex(int index){
        if(index >= size && index < 0){
            return false;
        }
        return true;
    }
    public int getSize(){
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dCollection that = (dCollection) o;
        return Arrays.equals(coll, that.coll);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coll);
    }
}
