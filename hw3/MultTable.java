package hw3;
import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        {
            Scanner console = new Scanner(System.in);
            int userNum = console.nextInt();

            for(int i = 0; i < 10; i++){
                System.out.println(userNum * (1+i));
            }
        }
    }
}
