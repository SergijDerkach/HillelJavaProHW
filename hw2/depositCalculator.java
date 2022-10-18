package hw2;

public class depositCalculator {
    public static void main(String[] args) {
        double sum = Integer.parseInt(args[0]);
        double percentDeposit = Integer.parseInt(args[1]);
        double year = Integer.parseInt(args[2]);

        double sumsDeposit = 0d;
        double yearPercentDeposit = 0d;

        for (int i=0;i<year;i++){
            int moutns = (i+1)*12;

            sumsDeposit = sum*(Math.pow((1+((percentDeposit/100)/12)),moutns));
            yearPercentDeposit = sumsDeposit - sum ;

            System.out.println("Сумма депозита "+String.format("%.2f",sumsDeposit) + ", процент за год " +String.format("%.2f",yearPercentDeposit));
        }

    }
}
