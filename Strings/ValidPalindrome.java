package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String trimmedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i < trimmedString.length() / 2; i++) {
            if(trimmedString.charAt(i) != trimmedString.charAt(trimmedString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
