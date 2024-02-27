package Arrays;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(list)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }
}
