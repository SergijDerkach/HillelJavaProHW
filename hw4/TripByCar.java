package hw4;

import java.text.DecimalFormat;

public class TripByCar {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat( "#.#" );

//        double tank = Integer.parseInt(args[0]);
//        double balanceInTank = Integer.parseInt(args[1]);
//        double fuelConsumption = Integer.parseInt(args[2]);

        double priceFuel = Integer.parseInt(args[0]);
        double tank = 50d;
        double balanceInTank = 35d;
        double fuelConsumption = 7d;

        double distKievZhashkiv = 149;
        double distZhashkivKryveOzero = 153;
        double distKryveOzeroOdessa = 179;
        double fulldistance = distKievZhashkiv + distZhashkivKryveOzero + distKryveOzeroOdessa;
        double fuelForDistance = 0;

        TripByCar car = new TripByCar();
        balanceInTank = car.fillUpFullTank(tank);
        System.out.println("Бак заправлен, в баке: " + balanceInTank);
        balanceInTank = Double.parseDouble(decimalFormat.format(car.nowBake(balanceInTank,distKievZhashkiv,fuelConsumption)));
        System.out.println("После проезда "+ distKievZhashkiv +" км в баке осталось: " + balanceInTank);
        fuelForDistance = Double.parseDouble(decimalFormat.format(car.needFuel(fulldistance,fuelConsumption,balanceInTank)));
        System.out.println("Для проезда "+fulldistance +" нужно дозаправить еще:" + fuelForDistance);
    }
    double fillUpFullTank(double tank){
        return tank;
    }

    double nowBake(double balanceInTank, double distKievZhashkiv, double fuelConsumption){
        return balanceInTank - (distKievZhashkiv/fuelConsumption);
    }

    double needFuel(double fulldistance,double fuelConsumption,double balanceInTank){
        return Math.abs(balanceInTank - (fulldistance/fuelConsumption));
    }


}
