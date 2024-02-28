package Strings;

public class MinPartitions {
    public static void main(String[] args) {
        String text = "32";
        System.out.println(minPartitions(text));
    }

    public static int minPartitions(String n) {
        int max = 0;

        for(int i = 0; i < n.length(); i++) {
            if(n.charAt(i) - '0' == 9) {
                return 9;
            }
            max = Math.max(max, n.charAt(i) - '0');
        }
        return max;
    }
}
