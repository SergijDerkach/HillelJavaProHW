package hw6;

public interface SubscriberService {

  public void infoAboutSub(double limitCityTimeMin, double cityTimeMin, Object str);

  public void infoSubsUselongDistanceCall(double longDistanceCallsMin,Object str);

  public  void searcSubsFirstLetter(String firstLetter,String subsName,String subsSurname,String subsPatronymic,double subsBalance);

  public  void sumTrafficCity(Subscriber[] listSubs,String searchCity,double sumTraffic);

  public void listSubsNegativeBal(Subscriber[] listSubs);

}
