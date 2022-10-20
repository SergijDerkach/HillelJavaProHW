package hw3;

public class tenNumders {
    public static void main(String[] args) {
        int [] tenNums = {1,3,5,7,9,11,13,15,17,19};
        int count = 1;

        for(int i = 0; i < tenNums.length; i++){
            if(count == 10){
                System.out.print(tenNums[i]);
            }else {
                System.out.print(tenNums[i] + ",");
            }
            count++;
        }
    }
}
