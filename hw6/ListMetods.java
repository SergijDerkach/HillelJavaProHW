package hw6;

public class ListMetods implements SubscriberService{
    @Override
    public void infoAboutSub(double limitCityTimeMin, double cityTimeMin, Object strSubsInfo) {
        if(limitCityTimeMin < cityTimeMin){
            System.out.println(strSubsInfo.toString());
        }
    }

    @Override
    public void infoSubsUselongDistanceCall(double longDistanceCallsMin, Object strSubsInfo) {
        if(longDistanceCallsMin > 0 ){
            System.out.println(strSubsInfo.toString());
        }
    }

    @Override
    public void searcSubsFirstLetter(String firstLetter,String subsName,String subsSurname,String subsPatronymic,double subsBalance) {
        String subsFirstLetter = subsSurname.trim();
        subsFirstLetter =subsFirstLetter.toLowerCase();
        subsFirstLetter = String.valueOf(subsFirstLetter.charAt(0));

        if(firstLetter.equals(subsFirstLetter)){
            System.out.println("Name: " + subsName + ", Surname: " + subsSurname + ", Patronymic: " + subsPatronymic + ", balance: " +subsBalance);
        }
    }

    @Override
    public void sumTrafficCity(Subscriber[] listSubs,String searchCity,double sumTraffic) {
        for (int i =0;i<listSubs.length;i++){
            double subsTraffic = listSubs[i].getInternetTrafficGb();
            String subsCity =  listSubs[i].getCity();
            if(searchCity.equals(subsCity)){
                sumTraffic +=subsTraffic;
            }
        }
        System.out.println("Traffic in city: " + String.format("%.2f",sumTraffic));
    }

    @Override
    public void listSubsNegativeBal(Subscriber[] listSubs) {
        for (int i =0;i<listSubs.length;i++){
            double subsBalanc = listSubs[i].getBalanc();
            if(subsBalanc<=0){
                System.out.println(listSubs[i].toString());
            }
        }
    }
}
