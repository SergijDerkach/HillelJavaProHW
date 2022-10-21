package hw3;

public class searchMinNum {
    public static void main(String[] args) {
        int [] Numbers = {0,3,-6,2,-6,3,3};
        int min = 0;

        for (int i =0; i< Numbers.length;i++){
            if(min > Numbers[i]){
                min = Numbers[i];
            }
        }

        for(int i =0; i< Numbers.length;i++){
            if(min == Numbers[i]){
                System.out.println(min);
            }
        }
    }
}
