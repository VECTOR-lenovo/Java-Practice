package Worshop6;
import java.util.ArrayList;
import java.util.Collections;
public class Q12 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        Collections.sort(nums);
        System.out.println("Sorted list: " + nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("Sorted list in reverse order: " + nums);

    }
}
