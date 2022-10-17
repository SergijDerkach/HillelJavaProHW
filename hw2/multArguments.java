package hw2;

public class multArguments {
    public static void main(String[] args) {
        double []Numbers = new double [10];
        double sum = 0;
        int counter = 0;

        for(int i = 0;i<Numbers.length;i++){
            Numbers[i] = i;
            sum = sum + Numbers[i];
            counter++;
        }

        double midArithmetic =sum/counter;
        System.out.println("Среднее арифметическое " + counter + " чисел, равняется: " + midArithmetic);

    }
}

