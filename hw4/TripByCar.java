package hw4;
import java.text.DecimalFormat;
public class TripByCar {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat( "#.#" );

        double priceFuel = Integer.parseInt(args[0]);
        double tank = 50d;
        double balanceInTank = 35d;
        double fuelConsumption = 7d;
        double distKievZhashkiv = 149;
        double distZhashkivKryveOzero = 153;
        double distKryveOzeroOdessa = 179;
        double fuelForDistance = 0d;

        TripByCar car = new TripByCar();
        // в киеве
        System.out.println("В наче поездке в баке: " + balanceInTank);
        System.out.println("-----------------------------------");

        // от киев до жашкова
        balanceInTank = Double.parseDouble(decimalFormat.format(car.nowBake(balanceInTank,distKievZhashkiv,fuelConsumption)));
        System.out.println("От Киев до Жашкова в баке : " + balanceInTank);
        fuelForDistance = Double.parseDouble(decimalFormat.format(car.needFuel(distKievZhashkiv,fuelConsumption)));
        System.out.println("От Киев до Жашкова: " + fuelForDistance);
        balanceInTank = car.fillUpFullTank(tank);
        System.out.println("В Жашковае заправил полный бак: " + balanceInTank);
        System.out.println("-----------------------------------");

        // от жашкова до кривого озера
        fuelForDistance += Double.parseDouble(decimalFormat.format(car.needFuel(distZhashkivKryveOzero,fuelConsumption)));
        System.out.println("От Киев до Кривого Озера: " + Double.parseDouble(decimalFormat.format(fuelForDistance)));
        balanceInTank = car.fillUpFullTank(tank);
        System.out.println("В Кривом Озере заправил полный бак: " + balanceInTank);
        System.out.println("-----------------------------------");

        // от кривого озера до одессы
        fuelForDistance += Double.parseDouble(decimalFormat.format(car.needFuel(distKryveOzeroOdessa,fuelConsumption)));
        System.out.println("От Кривого Озера до Одессы: " + Double.parseDouble(decimalFormat.format(fuelForDistance)));
        System.out.println("-----------------------------------");

        System.out.println("Стоимость потраченого бензина на поезду: " +Double.parseDouble(decimalFormat.format(fuelForDistance*priceFuel)));
        System.out.println("В баке осталось: " + (balanceInTank - Double.parseDouble(decimalFormat.format(car.needFuel(distKryveOzeroOdessa,fuelConsumption)))));
        System.out.println("-----------------------------------");

        double enoughFuel = Double.parseDouble(decimalFormat.format(car.nowBake(25,380,7)));

        if(enoughFuel > 0){
            System.out.println("Бензина хватить для поездки");
        }else
            System.out.println("Необходимо дозаправить минимум - " + Math.abs(enoughFuel));
    }
    double fillUpFullTank(double tank){
        return tank;
    }

    double nowBake(double balance, double dist, double fuelConsumption){

        return balance - ((dist/100)*fuelConsumption);
    }

    double needFuel(double distance,double fuelConsumption){
        return Math.abs((distance/100)*fuelConsumption);
    }
}
