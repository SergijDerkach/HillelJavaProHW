package hw3;

public class SearchMinNum {
    public static void main(String[] args) {
        int [] numbers = {0,3,-6,2,-6,3,3};
        int min = 0;

        for (int i =0; i< numbers.length;i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }

        for(int i =0; i< numbers.length;i++){
            if(min == numbers[i]){
                System.out.println(min);
            }
        }
    }
}
