package hw3;

public class oddNumbersDoWhile {
    public static void main(String[] args) {
        int n = 0;
        do{
            if(n % 2 != 0){
                System.out.println(n);
            }
            n++;
        } while (n<100);
    }
}
