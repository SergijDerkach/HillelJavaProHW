package hw10_1;

public class SquareRoot {
    public static void main(String[] args) {
        // "2x+x-3=0";
        FormulaAnfValues numbers = new FormulaAnfValues();
        FormulaServiseImp numOperation = new FormulaServiseImp();
        numbers.setFirstNum(2);
        numbers.setSecondNum(1);
        numbers.setThirdNum(-3);

        double chekNum = numOperation.chekNumder(numbers.getFirstNum(), numbers.getSecondNum(), numbers.getThirdNum());

        if(chekNum < 0 ){
            System.out.println("Для этого уравнения нет корней, посколькоку D равняется: "+ chekNum);
        } else if (chekNum == 0) {
              numOperation.oneRoot(numbers.getFirstNum(), numbers.getSecondNum());
        }else {
            numOperation.twoRoots(numbers.getFirstNum(), numbers.getSecondNum(),chekNum);
        }
    }
}
