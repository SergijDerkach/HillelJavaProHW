package hw6;

public class SubscriberServiceImp extends Subscriber{
    public SubscriberServiceImp(String id, String name, String surname, String patronymic, String city, String phoneNumber, String contractNumber, double balanc, double cityTimeMin, double longDistanceCallsMin, double internetTrafficGb) {
        super(id, name, surname, patronymic, city, phoneNumber, contractNumber, balanc, cityTimeMin, longDistanceCallsMin, internetTrafficGb);
    }

    public static void main(String[] args) {
        double limCityTimeMin = 50.0d;

        ListMetods subsSerImp = new ListMetods();
        Subscriber [] subsList = new Subscriber[10];

        subsList[0] = new Subscriber("1", "Ivan", "Ivanov", "Ivanovach", "Dnepr", "380958652541", "cr-0012895", 95.5d, 18.35d, 0.00d, 6.6d);
        subsList[1] = new Subscriber("2", "Petro", "Petrov", "Petrovuich", "Zaporizhzhya", "380958652542", "cr-0022895", 25.2d, 8.35d, 15.09d, 8.0d);
        subsList[2] = new Subscriber("3", "Sidor", "Sidorov", "Sergiyovuch", "Zaporizhzhya", "380958652543", "cr-0012395", -15.4d, 30.0d, 0.00d, 5.6d);
        subsList[3] = new Subscriber("4", "Sergij", "Melnuk", "Ivanovich", "Zaporizhzhya", "380958652544", "cr-0013895", 110.3d, 1.15d, 5.00d, 1.3d);
        subsList[4] = new Subscriber("5", "Oleksandr", "Boyko", "Ivanovach", "Dnepr", "380958652545", "cr-0042895", -80.1d, 8.45d, 12.03d, 2.2d);
        subsList[5] = new Subscriber("6", "Igor", "Koval", "Petrovuich", "Dnepr", "380958652546", "cr-0012825", 23.1d, 50.11d, 0.00d, 5.1d);
        subsList[6] = new Subscriber("7", "Irina", "Bondar", "Ivanovach", "Dnepr", "380958652547", "cr-0012225", 65.2d, 80.56d, 0.00d, 2.2d);
        subsList[7] = new Subscriber("8", "Sveta", "Moroz", "Petrovuich", "Zaporizhzhya", "380958652548", "cr-0012335", -5.d, 10.23d, 00.00d, 12.6d);
        subsList[8] = new Subscriber("9", "Olga", "Kravchuk", "Sergiyovuch", "Dnepr", "380958652549", "cr-0018895", 10.0d, 15.44d, 15.55d, 3.3d);
        subsList[9] = new Subscriber("10", "Ivan", "Mazur", "Ivanovach", "Zaporizhzhya", "380958652511", "cr-0012811", 1.5d, 0.33d, 53.02d, 1.9d);


        for (int i = 0; i<subsList.length; i++){
            double subslimit = subsList[i].getCityTimeMin();
            subsSerImp.infoAboutSub(limCityTimeMin,subslimit,subsList[i]);
        }

        System.out.println("----------------------------------------------");

        for (int i = 0; i<subsList.length; i++){
            double longDistanceCallsMin = subsList[i].getLongDistanceCallsMin();
            subsSerImp.infoSubsUselongDistanceCall(longDistanceCallsMin,subsList[i]);
        }

        System.out.println("----------------------------------------------");
        String firtsLett = "i";
        for (int i = 0; i<subsList.length; i++){
            String subsName = subsList[i].getName();
            String subsSurname = subsList[i].getSurname();
            String subsPatronymic = subsList[i].getPatronymic();
            double subsBalance = subsList[i].getBalanc();

            subsSerImp.searcSubsFirstLetter(firtsLett,subsName,subsSurname,subsPatronymic,subsBalance);
        }
        System.out.println("----------------------------------------------");
          String searchCity = "Dnepr";
          double sumTraffic = 0.0d;
          subsSerImp.sumTrafficCity(subsList,searchCity,sumTraffic);
        System.out.println("----------------------------------------------");

        subsSerImp.listSubsNegativeBal(subsList);
          System.out.println("----------------------------------------------");
    }
}
