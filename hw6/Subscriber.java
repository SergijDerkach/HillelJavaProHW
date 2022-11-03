package hw6;

public class Subscriber {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private double balanc;
    private double cityTimeMin;
    private double longDistanceCallsMin;
    private double internetTrafficGb;

    public Subscriber(String id, String name, String surname, String patronymic, String city, String phoneNumber, String contractNumber, double balanc, double cityTimeMin, double longDistanceCallsMin, double internetTrafficGb) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balanc = balanc;
        this.cityTimeMin = cityTimeMin;
        this.longDistanceCallsMin = longDistanceCallsMin;
        this.internetTrafficGb = internetTrafficGb;
    }
    public static void main(String[] args) {
        double limCityTimeMin = 50.0d;
        SubscriberServiceImp subsSerImp = new SubscriberServiceImp();
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


        for(Subscriber sb: subsList){
            double subslimit = sb.getCityTimeMin();
            subsSerImp.infoAboutSub(limCityTimeMin,subslimit,sb);
        }
        System.out.println("----------------------------------------------");

        for (Subscriber sb: subsList){
            double longDistanceCallsMin = sb.getLongDistanceCallsMin();
            subsSerImp.infoSubsUselongDistanceCall(longDistanceCallsMin,sb);
        }
        System.out.println("----------------------------------------------");

        String firtsLett = "i";
        for (Subscriber sb: subsList){
            String subsName = sb.getName();
            String subsSurname = sb.getSurname();
            String subsPatronymic = sb.getPatronymic();
            double subsBalance = sb.getBalanc();
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
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public double getBalanc() {
        return balanc;
    }

    public void setBalanc(double balanc) {
        this.balanc = balanc;
    }

    public double getCityTimeMin() {
        return cityTimeMin;
    }

    public void setCityTimeMin(double cityTimeMin) {
        this.cityTimeMin = cityTimeMin;
    }

    public double getLongDistanceCallsMin() {
        return longDistanceCallsMin;
    }

    public void setLongDistanceCallsMin(double longDistanceCallsMin) {
        this.longDistanceCallsMin = longDistanceCallsMin;
    }

    public double getInternetTrafficGb() {
        return internetTrafficGb;
    }

    public void setInternetTrafficGb(double internetTrafficGb) {
        this.internetTrafficGb = internetTrafficGb;
    }
    public void Subs (String id, String name, String surname, String patronymic, String city, String phoneNumber, String contractNumber, double balanc, double cityTimeMin, double longDistanceCallsMin, double internetTrafficGb) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.contractNumber = contractNumber;
        this.balanc = balanc;
        this.cityTimeMin = cityTimeMin;
        this.longDistanceCallsMin = longDistanceCallsMin;
        this.internetTrafficGb =internetTrafficGb;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contractNumber='" + contractNumber + '\'' +
                ", balanc=" + balanc +
                ", cityTimeMin=" + cityTimeMin +
                ", longDistanceCallsMin=" + longDistanceCallsMin +
                ", internetTrafficGb=" + internetTrafficGb +
                '}';
    }

}
