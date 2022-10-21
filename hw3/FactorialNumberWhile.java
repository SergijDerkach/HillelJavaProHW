package hw3;

public class FactorialNumberWhile {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        int coppyN = n;

        while (n > 0){
            result *= n;
            n--;
        }
        System.out.println("Factorial number "+ coppyN +" = "+result);
    }
}
