package service.imp;

import org.junit.Assert;
import org.junit.Test;


public class CollectionServiseImpTest {

    @Test
    public void add() {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("2");
        coll.add("2");
        int size = coll.size();
        Assert.assertEquals(2,size);
    }

    @Test
    public void testAdd() {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add(1,"2");
        coll.add(0,"1");
        String val = coll.get(0);
        Assert.assertEquals("1",val);
    }

    @Test
    public void delete() {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("2");
        coll.add("1");
        coll.add("3");
        coll.delete("0");

        int size = coll.size();
        Assert.assertEquals(2,size);
    }

    @Test
    public void get() {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("2");
        coll.add("1");
        coll.add("3");
        int index = 2;
        String ind = coll.get(index);
        Assert.assertEquals("3",ind);
        int s = coll.size();
        boolean chekIn = false;
        if(0 <= index && index < s){
            chekIn = true;
        }
        Assert.assertEquals(true,chekIn);
    }

    @Test
    public void contains() {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("2");
        coll.add("1");
        coll.add("3");

        boolean isStr = coll.contains("1");
        Assert.assertEquals(true,isStr);
        isStr = coll.contains("4");
        Assert.assertEquals(false,isStr);


    }

    @Test
    public void clear() {
        CollectionServiseImp coll = new CollectionServiseImp();
        coll.add("2");
        coll.add("1");
        coll.add("3");
        coll.clear();
        int s = coll.size();
        Assert.assertEquals(0,s);
    }
}