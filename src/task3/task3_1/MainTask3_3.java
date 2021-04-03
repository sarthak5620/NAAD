package task3.task3_1;
import java.util.*;

class TouristPlace{
   String name;
   String workingHour ;
   int entryTicketPrice;
   int noOfRatings;
   float starRating ;
    List<String> famousFor ;

  public TouristPlace( String name, String  workingHour, int entryTicketPrice){
    famousFor = new ArrayList<>();
    noOfRatings=0;
    starRating = 0;
  }
    void rate(int stars){
        starRating = starRating*noOfRatings + stars;
        noOfRatings++;
        starRating /= noOfRatings;
    }
    TouristPlace addFamousFor(String s){
      famousFor.add(s);
      return this;
    }
    boolean isPlaceOpen(){
      return true;
    }
}
class City{
    String name;
    String state ;
    List<TouristPlace>touristPlaces;
    City(String name, String state){
        touristPlaces = new ArrayList<>();
    }
}
public class MainTask3_3 {
    public static void main(String[] args) {
        TouristPlace rajasthan = new TouristPlace("Jaipur","10:00Am to 6.00PM",500);
        rajasthan.addFamousFor("Jaipur");
        rajasthan.addFamousFor("Culture");
        rajasthan.addFamousFor("Heritage");
        rajasthan.rate(5);
        rajasthan.rate(4);
        rajasthan.rate(5);

        System.out.println("Rating is " + rajasthan.starRating);
    }
}
