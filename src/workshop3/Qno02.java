package workshop3;
import java.util.Arrays;
public class Qno02 {
    int sum = 0, avg;
    int[] nums;

    public static void main(String[] args) {
        Qno02 mainInstance = new Qno02();
        mainInstance.newArray();
        mainInstance.Avg_sum();
    }

    public void newArray() {
        nums = new int[]{1, 2, 3, 4, 5};
    }

    public void Avg_sum() {
        for (int number : nums) {
            sum += number;
        }
        avg = sum / nums.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
