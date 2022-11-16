package hw9;

public class Link {
    public String str;
    public int index;
    public Link next;

    public Link(String s, int i){
        str = s;
        index = i;
    }

    public void displayLink(){
        System.out.print("{ s - " + str +"/ i - "+index+ "}" + "|");
    }
}
