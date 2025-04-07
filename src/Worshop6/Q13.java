package Worshop6;
import java.util.ArrayList;
import java.util.Collections;
public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> Colors = new ArrayList<String>();
        Colors.add("green");
        Colors.add("yellow");
        Colors.add("blue");
        Colors.add("red");
        Colors.add("orange");
        Collections.sort(Colors);
        System.out.println("Sorted list: " + Colors);
        Collections.sort(Colors, Collections.reverseOrder());
        System.out.println("Sorted list in reverse order: " + Colors);
    }
}
