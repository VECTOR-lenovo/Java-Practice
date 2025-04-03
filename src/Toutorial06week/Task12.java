package Toutorial06week;
import java.util.Set;
import java.util.TreeSet;

public class Task12 {
    public static void main(String[] args) {
        Set<Integer> setA = new TreeSet<Integer>();
        Set<Integer> setB = new TreeSet<Integer>();
        for (int i=1; i<=6; i++){
            setA.add(i);
        }
        for (int i=1; i<=3; i++){
            setB.add(i);
        }
        boolean isSubset = setA.containsAll(setB);
        System.out.println(isSubset);

    }
}
