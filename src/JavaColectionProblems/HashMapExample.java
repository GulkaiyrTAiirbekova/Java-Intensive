package JavaColectionProblems;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String [] args){
        //Create a HashMap
        Map<String,String> capitalCities =new HashMap<>();
        //Add elements

        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Kyrgyzstan","Bishkek");

        //Access an element

        System.out.println("Capital of England : " + capitalCities.get("England"));

        //Remove an Element
        capitalCities.remove("Germany");

        //Iterate through the HaskMap

        for (String country: capitalCities.keySet()){
            System.out.println("Country: " + country +" ,Capital: " +capitalCities.get(country));
            System.out.println(capitalCities.size());
        }
    }
}
