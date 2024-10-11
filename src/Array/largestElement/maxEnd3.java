package Array.largestElement;
import java.util.Arrays;
public class maxEnd3 {
    public int[] maxEnd3(int[] nums) {
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 3};
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
