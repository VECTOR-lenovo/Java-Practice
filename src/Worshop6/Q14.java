package Worshop6;
import java.util.ArrayList;
import java.util.Collections;
public class Q14 {
    public static void main(String[] args) {
        ArrayList<Integer> Nums= new ArrayList<Integer>();
        Nums.add(1);
        Nums.add(2);
        Nums.add(3);
        Nums.add(4);
        Nums.add(5);

        int target=4;
        int index= Collections.binarySearch(Nums, target);
        if (index<0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + index);
        }
    }
    public static int binarySearch(ArrayList<Integer> List, int target) {
        int start = 0;
        int end = -List.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (List.get(mid) == target) {
                return mid;
            } else if (List.get(mid) < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
