package hw3;

public class OddNumbersWhile {
    public static void main(String[] args) {
        int num = 0;
        while (num < 100){
            if(num % 2 != 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
