package hw3;

public class FactorialNumber {
    public static void main(String[] args) {
        int n = 5;
        int result = 1;
        int count = n;

        for(int i=0;i<count;i++){
            result *= n;
            n--;
        }
        System.out.println("Factorial number "+ count +" = "+result);
    }
}
