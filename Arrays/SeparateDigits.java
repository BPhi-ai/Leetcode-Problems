package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateDigits {
    public static void main(String[] args) {
        int[] nums = {13,25,83,77};
        System.out.println(Arrays.toString(separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            String text = Integer.toString(nums[i]);
            String[] splitString = text.split("", text.length());
            for(int j = 0; j < splitString.length; j++) {
                int convert = Integer.parseInt(splitString[j]);
                result.add(convert);
            }
        }
        int[] list = new int[result.size()];
        for(int i = 0; i < list.length; i++) {
            list[i] = result.get(i);
        }
        return list;
    }
}
