package hw10_1;

public class FormulaServiseImp implements FormulaServise{
    @Override
    public double chekNumder(double a, double b, double c) {
        return Math.pow(b,2) - (4*a*c);
    }

    @Override
    public boolean oneRoot(double a, double b) {
        System.out.println("Корень = "+ (-(b / (2 * a))));
        return true;
    }

    @Override
    public boolean twoRoots(double a, double b,double cNum) {
        System.out.println("Первый корень = "+ String.format("%.1f",(-b + Math.sqrt(cNum))/(2*a)));
        System.out.println("Второй корень = "+ String.format("%.1f",(-b - Math.sqrt(cNum))/(2*a)));
        return true;
    }


}
