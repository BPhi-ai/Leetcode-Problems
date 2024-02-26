package Arrays;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandy = 3;

        List<Boolean> list = kidsWithCandies(candies, extraCandy);
        
        System.out.print("[");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.print("]");
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = 0;

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > max) {
                max = candies[i];
            }
        }

        for(int j = 0; j < candies.length; j++) {
            if(candies[j] + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
      
        return list;
    }
}
