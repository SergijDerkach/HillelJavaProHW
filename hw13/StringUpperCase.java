package hw13;
import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class StringUpperCase {
    public static void main(String[] args) {
        List<String> strings = List.of("one","two","three","four");
        List<String> stringsUp = (List<String>) strings.stream().map(s->s.toUpperCase()).collect(toCollection(LinkedList::new));

        strings.stream().forEach(s -> System.out.print(s+" "));
        System.out.println("");
        stringsUp.stream().forEach(s -> System.out.print(s+" "));

    }
}
