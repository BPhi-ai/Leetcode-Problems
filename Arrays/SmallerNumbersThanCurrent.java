package Arrays;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int counter = 0;
        int[] results = new int[nums.length];

        for(int a = 0; a < nums.length; a++) {
            for(int b = 0; b < nums.length; b++) {
                if(nums[a] > nums[b]) {
                    counter++;
                }
            }
            results[a] = counter;
            counter = 0;
        }
        return results;
    }
}
