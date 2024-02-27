package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountPairsLessThanTarget {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int target = -2;

        list.add(-6);
        list.add(2);
        list.add(5);
        list.add(-2);
        list.add(-7);
        list.add(-1);
        list.add(3);

        System.out.println(countPairs(list, target));
    }

    public static int countPairs(List<Integer> nums, int target) {
        int counter = 0;
        
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) < target) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
