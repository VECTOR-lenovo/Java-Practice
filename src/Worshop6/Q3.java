package Worshop6;
import java.util.ArrayList;
import java.util.Collections;
public class Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        int rotateIndex =2;
        rotateList(numbers, rotateIndex);
    }

    private static void rotateList(ArrayList<Integer> numbers, int rotateIndex) {
        if (rotateIndex < 0 || rotateIndex >= numbers.size()) {
            System.out.println("Invalid rotate index");
            return;
        }
        Collections.rotate(numbers, rotateIndex);
        System.out.println("Rotated list: " + numbers);
    }
}
