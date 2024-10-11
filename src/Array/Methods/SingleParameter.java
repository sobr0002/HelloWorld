package Array.Methods;

public class SingleParameter {

    /*Write a method that takes a single parameter: An array of integers.
    The method returns the lowest value from the array */

    /*Når et element skal returneres, skal der ikke [] efter datatype foran metode-navn:
    = public static int lowestValue(int[] nums) {
    Returnér et helt array: int [] lowestValue(int[] nums) { */
        public static int lowestValue(int[] nums) {
            int smallest = nums[0];
            for (int i = 1; i < nums.length; i++) {

                if (nums[i] < smallest) {
                    smallest = nums[i];
                }
            }
            return smallest;
                    }
    public static void main(String[] args) {

        int[] numbers = new int[]{2, 2, 1, 4, 5};
        int smallestNumber = lowestValue(numbers);
        System.out.println(smallestNumber);
    }
    }



