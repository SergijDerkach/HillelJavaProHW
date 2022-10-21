package hw3;

public class replaceNums {
    public static void main(String[] args) {
        int numbers[] = {4,-2,0,6,5};
        int min = 0;
        int max = 0;

        for(int i = 0; i<numbers.length;i++){
            if(min >= numbers[i]){
                min = numbers[i];
            }else if(max <= numbers[i]){
                max = numbers[i];
            }
        }

        for(int i = 0; i<numbers.length;i++){
            if(min == numbers[i]){
                numbers[i] = max;
            } else if(max == numbers[i]){
                numbers[i] = min;
            }
        }

        for (int i = 0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}
