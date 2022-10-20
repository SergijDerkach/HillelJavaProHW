package hw3;

public class factorialNumberDoWhile {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;

        do{
            result *= n;
            n--;
        }while (n>0);

        System.out.println(result);
    }
}
