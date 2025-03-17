package workshop3;

import java.util.Arrays;

public class Qno01 {
    int i, temp;
    int[] nums;

    public static void main(String[] args) {
        Qno01 mainInstance = new Qno01();
        mainInstance.newArray();
        mainInstance.Arrayreversed();
    }

    public void newArray() {
        nums = new int[]{1, 2, 3, 4, 5};
    }

    public void Arrayreversed() {
        for (i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
