package Worshop6;

import java.util.HashSet;

public class Q9 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        HashSet<String> set2 = new HashSet<String>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        HashSet<String> union = performUnion(set1, set2);
        System.out.println("Union: " + union);

        HashSet<String> intersection = performIntersection(set1, set2);
        System.out.println("Intersection: " + intersection);

        HashSet<String> difference = performDifference(set1, set2);
        System.out.println("Difference: " + difference);
    }

    public static HashSet<String> performUnion(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        return union;
    }

    public static HashSet<String> performIntersection(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    public static HashSet<String> performDifference(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> difference = new HashSet<String>(set1);
        difference.removeAll(set2);
        return difference;
    }
}




