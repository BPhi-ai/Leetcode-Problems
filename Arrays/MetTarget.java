package Arrays;

public class MetTarget {
    public static void main(String[] args) {
        int[] list = {0,1,2,3,4};
        int target = 2;

        System.out.println(numberOfEmployeesWhoMetTarget(list, target)); 
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;

        for(int n : hours) {
            if(n >= target) counter++;
        }

        return counter;
    }
}
