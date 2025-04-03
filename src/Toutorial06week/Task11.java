package Toutorial06week;
import java.util.TreeSet;
public class Task11 {
    public static void main(String[] args) {
        TreeSet<String> setA = new TreeSet<String>();
        TreeSet<String> setB = new TreeSet<String>();
        setA.add("Red");
        setA.add("Green");
        setA.add("Blue");
        setB.add("Red");
        setB.add("Yellow");
        setB.add("Green");
        setB.add("Purple");
        TreeSet<String> intersection = new TreeSet<String>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection:"+intersection);
        TreeSet<String> union = new TreeSet<String>(setA);
        union.addAll(setB);
        System.out.println("Union:"+ union);
        TreeSet<String> difference = new TreeSet<String>(setA);
        difference.removeAll(setB);
        System.out.println("Difference:"+ difference);



    }
}
