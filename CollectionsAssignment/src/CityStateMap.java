import java.util.*;

public class CityStateMap {
    Map<String, String> cityStateMap = new HashMap<>();

    public static void main(String[] args) {
        CityStateMap csMap = new CityStateMap();
        csMap.addCityStatePair("Kolkata", "West Bengal");
        csMap.addCityStatePair("Howrah", "West Bengal");
        csMap.addCityStatePair("Bhopal", "Madhya Pradesh");
        csMap.addCityStatePair("Nagpur", "Maharashtra");
        csMap.addCityStatePair("Bangalore", "Karnataka");
        csMap.addCityStatePair("Allahabad", "Uttar Pradesh");

        System.out.println(csMap.getAllCities());
        System.out.println(csMap.getAllStates());
    }

    void addCityStatePair(String city, String state) {
        this.cityStateMap.put(city, state);
    }

    ArrayList<String> getAllCities() {
        ArrayList<String> allCities = new ArrayList<>();

        for(Map.Entry<String, String> x : this.cityStateMap.entrySet()) {
            allCities.add(x.getKey());
        }

        return allCities;
    }

    ArrayList<String> getAllStates() {
        ArrayList<String> allStates = new ArrayList<>();

        for(Map.Entry<String, String> x : this.cityStateMap.entrySet()) {
            allStates.add(x.getValue());
        }

        return allStates;
    }

}
