package Array.largestElement;
/* Given an array of ints length 3, figure out which is larger, the
first or last element in the array, and set all the other
elements to be that value. Return the changed array. */
import java.util.Arrays;

public class maxEnd1 {

    public int[] maxEnd3(int[] nums) {
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        if (nums[0] > nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
        } else {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        System.out.println(Arrays.toString(nums));
    }
}
