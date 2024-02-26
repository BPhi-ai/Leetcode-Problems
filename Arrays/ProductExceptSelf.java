package Arrays;
import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = {-1,1,0,-3,3};

        System.out.println(Arrays.toString(productExceptSelf(nums)));
        System.out.println(Arrays.toString(productExceptSelf(nums2)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0, temp = 1; i < nums.length; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        for(int i = nums.length - 1, temp = 1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }
}
