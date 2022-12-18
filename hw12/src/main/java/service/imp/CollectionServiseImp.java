package service.imp;

import service.CollectionServise;

import java.util.Arrays;
import java.util.Objects;

public class CollectionServiseImp implements CollectionServise {
    private String [] strs;
    private int defSize = 10;
    private int size =0;
    private int index = 0;

    public CollectionServiseImp(){
        strs = new String[defSize];
    }

    @Override
    public boolean add(String o) {
        if(size == strs.length){
            strs = increaseArray();
        }
        strs[size]= o;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, String o) {
        if(strs.length - size == 2 ){
            strs = increaseArray();
        }

        if(strs[index] == null){
            strs[index] = o;
            size++;
            return true;
        }else if (index >= 0 && index <= size){
            String t = strs[size-1];
            strs[index] = o;
            strs[size] = t;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String o) {
        int tIndex = 0;
        for(int i = 0; i<size;i++){
            if(strs[i].equals(o)){
                tIndex = i;
                break;
            }
        }
        strs[tIndex] = null;
        for(int i = tIndex; i<size;i++){
            strs[i] = strs[i+1];
        }
        size--;
        return true;
    }

    @Override
    public String get(int index) {
        if(checkIndex(index)){
            return strs[index];
        }
        return "index outside the collection";
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(String o) {
        for(String s: strs){
            if(s == o){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean clear() {
        for(int i = 0; i<size; i++){
            strs[i] = null;
        }
        size = 0;
        return true;
    }

    public String [] increaseArray(){
        String [] t = new String[(int) ((strs.length * 1.6) + 1)];
        System.arraycopy(strs,0,t,0,strs.length);
        return t;
    }

    public void displayColl(){
        for (String s: strs){
            System.out.print("/ " + s);
        }
    }

    public boolean checkIndex(int index){
        if(index >= size && index >= 0){
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(defSize, size);
        result = 31 * result + Arrays.hashCode(strs);
        return result;
    }

    public String [] getStrs(){
        return strs;
    }
}
