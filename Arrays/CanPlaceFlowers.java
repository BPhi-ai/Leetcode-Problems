package Arrays;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = flowerbed.length;
        int count = 0;

        //no space
        if(num == 0) {
            return false;
        //one spot is available
        } else if (num == 1) {
            if(flowerbed[0] == 0 && n <= 1) {
                return true;
            } else if (flowerbed[0] == 1 && n == 0) {
                return true;
            } else {
                return false;
            }
        //more than one spot is available
        } else {
            //checks each spot in order to see if a spot is available or not
            for(int i = 0; i < num; i++) {
                //if the first spot is empty, and that the next spot is also empty, then add count.
                if(i == 0) { 
                    if(flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        count++;
                    }
                // if there is more than one spot, then the scenario is: if the first spot is empty, second spot is empty,
                // and the third spot is also empty, then add count.
                } else if(i > 0 && i < num - 1) {
                    if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        count++;
                    }
                // first spot empty, and the one before it is also empty, then add count.
                } else {
                    if(flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        count++;
                    }
                }
            }
            if(count >= n) {
                return true;
            }
            return false;
        }
    }
}
