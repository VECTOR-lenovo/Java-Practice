package Toutorial06week;
import java.util.LinkedList;
public class Task05 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.set(1, "purple");
        colors.remove("blue");
        System.out.println(colors);
    }
}
