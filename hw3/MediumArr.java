package hw3;

public class MediumArr {
    public static void main(String[] args) {
        int nums[] = {2,5,-9,4,2,6,7};
        double result = 0d;

        for(int i = 0; i<nums.length;i++){
            result +=nums[i];
        }

        result = result/(nums.length);
        System.out.println("Medium number arry nums = "+String.format("%.2f",result));

    }
}
