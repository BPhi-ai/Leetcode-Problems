package Arrays;

public class GoodPairs {
    public static void main(String[] args) {
        int[] list = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(list));
    }

    public static int numIdenticalPairs(int[] nums) {
        int counterGood = 0;

        for(int a = 0; a < nums.length; a++) {
            for(int b = 0; b < nums.length; b++) {
                if(nums[a] == nums[b] && a < b) {
                    counterGood++;
                }
            }
        }
        return counterGood;
    }
}
