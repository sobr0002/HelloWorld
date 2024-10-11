package Array.largestElement;
/* Given an array of ints length 3, figure out which is
larger, the first or last element in the array, and set all
the other elements to be that value.
 */
import java.util.Arrays;
public class maxEnd01 {

    public static void main(String[] args) {
        int[] nums = {1,2,3}; //Tildel arrayen maxEnd3 value i main.
        int max = Math.max(nums[0], nums[2]);
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;

        System.out.println(Arrays.toString(nums)); //Print vha. Array.toString()
    }

    }
// Opg. er uden retur!
