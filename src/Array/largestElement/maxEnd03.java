package Array.largestElement;
import java.util.Arrays;
/* Given an array of ints length 3, figure out which is larger,
 the first or last element in the array, and set all the other
 elements to be that value.
 */
public class maxEnd03 {

    public static void main(String[] args) {
        int[] nums = {2,11,3};
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        System.out.println(Arrays.toString(nums));
    }


}
// Opg. er uden retur! Derfor skrives den kun i main.