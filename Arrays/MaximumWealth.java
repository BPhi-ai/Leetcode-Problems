package Arrays;

public class MaximumWealth {
    public static void main(String[] args) {
        int[][] list = {{1,2,3}, {3,2,1}};
        System.out.println(maximumWealth(list));
    }

    public static int maximumWealth(int[][] accounts) {
        int[] accountSize = new int[accounts.length];
        int index = 0;
        int sum = 0;
        int largestAmount = 0;

        //we will add all of the amounts from each bank account member.
        for(int[] s : accounts) {
            for(int a = 0; a < s.length; a++) {
                sum += s[a];
            }
            accountSize[index] = sum;
            index++;
            sum = 0;
        }

        for(int b = 0; b < accountSize.length; b++) {
            if(largestAmount < accountSize[b]) {
                largestAmount = accountSize[b];
            }
        }
        return largestAmount;
    }
}
