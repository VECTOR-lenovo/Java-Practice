package Toutorial06week;
import java.util.HashMap;
public class Task13 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);
        System.out.println("Initial map:"+map1);
        String keyToCheck = "B";
        if (map1.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the map.");
    }
        else {
        System.out.println("Key " + keyToCheck + " does not exist in the map.");}
    String keyToUpdate = "C";
        map1.put(keyToUpdate, 10);
        System.out.println("Updated map: " + map1);

        String keyToRemove = "A";
        map1.remove(keyToRemove);
        System.out.println("Map after removing key " + keyToRemove + ": " + map1);
    }
}
