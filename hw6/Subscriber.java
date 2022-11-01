package hw6;

public class Subscriber {
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String city;
    private String phoneNumber;
    private String contractNumber;
    private int balanc;
    private double cityTimeMin;
    private double longDistanceCallsMin;
    private double internetTrafficGb;

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

    public int getBalanc() {
        return balanc;
    }

    public void setBalanc(int balanc) {
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
