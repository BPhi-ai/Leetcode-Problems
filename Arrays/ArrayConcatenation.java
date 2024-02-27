package Arrays;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] test = {1,2,3,1};
        System.out.println(Arrays.toString(getConcatenation(test)));
    }

    public static int[] getConcatenation(int[] nums) {
       int[] list = new int[nums.length * 2];

       for(int i = 0; i < nums.length; i++) {
           list[i] = nums[i];
           list[i + nums.length] = nums[i];
       }
       return list;
    }
}
