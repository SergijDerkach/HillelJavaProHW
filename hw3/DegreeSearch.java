package hw3;

public class DegreeSearch {
    public static void main(String[] args) {
        int x = 5;
        int n = 3;
        int count = n;
        int result = 1;

        for(int i = 0; i < count; i++){
            result *=x;
            n--;
        }
        System.out.println("Result = "+result);
    }
}
