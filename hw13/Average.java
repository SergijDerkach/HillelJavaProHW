package hw13;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Average {

    public static void main(String[] args) {
        List<Integer> ints = List.of(2,5,7,3,6,23,4,2,4,3,2,5,6,5,4,3);
        int count = Math.toIntExact(ints.stream().count());
        AtomicInteger sum = new AtomicInteger();
        ints.stream().forEach(i -> sum.addAndGet(i));
        double mid = sum.get()/count;
        System.out.println("count: "+count);
        System.out.println("sum: " + sum.get());

        System.out.println("mid: " + mid);
    }
}
