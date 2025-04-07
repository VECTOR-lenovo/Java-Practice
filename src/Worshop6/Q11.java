package Worshop6;
import java.util.HashMap;

public class Q11 {
    public static void main(String[] args) {
        HashMap<String, String> CountryCapitals = new HashMap<String, String>();
        CountryCapitals.put("USA", "Washington, D.C.");
        CountryCapitals.put("India", "New Delhi");
        CountryCapitals.put("Japan", "Tokyo");
        CountryCapitals.put("France", "Paris");
        CountryCapitals.put("Germany", "Berlin");

        printMap(CountryCapitals);
    }

    public static void printMap(HashMap<String, String> map) {
        for (String country : map.keySet()) {
            System.out.println("Country: " + country + ", Capital: " + map.get(country));
        }
    }
}