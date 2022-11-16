package hw9;

import hw8.CollectionServiseImp;


public class CunstomCollectionImp implements CustomCollection{
    private Link fisrt;
    private CollectionServiseImp sColl;
    private int size = 0;
    private int in = 1;
    public CunstomCollectionImp(){
        fisrt = null;
    }

    @Override
    public String get(int in) {
        if(in > size){
            return "index outside";
        }
        Link temp = fisrt;
        while (temp.index != in){
            temp = temp.next;
        }

        return temp.str;
    }

    @Override
    public boolean delete(String str) {
        if(size == 0){
            return false;
        }
        Link temp = fisrt;
        while (temp != null){
            if(temp.str == str){
                System.out.println(temp.str);
                fisrt = fisrt.next;
                break;
            }
            temp = temp.next;
        }

        size--;
        return true;
    }

    @Override
    public boolean add(String str) {
        Link newLink = new Link(str,in);
        newLink.next = fisrt;
        fisrt = newLink;
        in++;
        size++;
        return true;
    }
    @Override
    public boolean addAll(CollectionServiseImp strColl) {
        sColl = strColl;
        Link current = fisrt;
        int count = 0;

        while (current.next != null){
            current = current.next;
        }

        for (String s: sColl.getStrs()){
            if(count == sColl.size()){
                break;
            }
            count++;
            Link nLink = new Link(s,in);
            current.next = nLink;
            current = current.next;
            in++;
            size++;
        }
        return true;
    }
    @Override
    public boolean delete(int index) {
       if(size == 0){
           System.out.println("size = 0!");
           return false;
       }
       if(index > size){
           System.out.println("index outside");
           return false;
       }

        Link curr = fisrt;
        Link pre = fisrt;

        while (curr.index != index){
            if(curr == null){
                return false;
            }else{
                pre = curr;
                curr = curr.next;
            }
        }
        if(curr == fisrt){
            fisrt = fisrt.next;
        }else {
            pre.next = curr.next;
        }
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    public void displayList(){
        Link current = fisrt;
        while (current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

    @Override
    public boolean contains(String str) {
        Link current = fisrt;
        while (current != null){
            if(current.str == str){
                current.displayLink();
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public boolean clear() {
        fisrt = null;
        size = 0;
        return true;
    }

    @Override
    public boolean trim() {
        return true;
    }
}
