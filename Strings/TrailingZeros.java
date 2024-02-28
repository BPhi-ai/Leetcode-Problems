package Strings;

public class TrailingZeros {
    public static void main(String[] args) {
        String num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }

    public static String removeTrailingZeros(String num) {
        int i = num.length() - 1;

        while(i >= 0 && num.charAt(i) == '0') {
            i--;
        }
        return num.substring(0, i + 1);
    }
}
