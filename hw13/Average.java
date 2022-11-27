package hw13;

import java.util.List;
import java.util.Optional;
public class Average {
    public static void main(String[] args) {
        List<Integer> ints = List.of(2,2,2,2,2);
        Optional<Integer> sum = ints.stream().reduce((x, y)->x+y);
        long count = ints.stream().count();
        System.out.println(sum.get() +"/"+count);
        System.out.println("mid: " + sum.get()/count);
    }
}
