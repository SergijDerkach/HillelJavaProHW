package hw13;

import java.util.List;

public class StringFilter {

    public static void main(String[] args) {
        List<String> list = List.of("one","Two","three","four","Five");
        list.stream().filter(l->l.length() ==4).map(s->{
            char [] temp = s.toCharArray();
            for(char t:temp){
                if(t >='A'&& t <= 'Z'){
                   return "";
                }
            }
            return s;
        }).filter(l->l.length() != 0).forEach(l-> System.out.println(l));
    }
}
