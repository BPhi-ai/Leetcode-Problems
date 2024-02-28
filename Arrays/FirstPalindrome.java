package Arrays;

public class FirstPalindrome {
    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++) {
            if(isPalindrome(words[i]) == true) {
                return words[i];
            }
        }
        return "";
    }

    public static boolean isPalindrome(String s) {
        String trimmedString = s.replaceAll(""," ").toLowerCase();
        for(int i = 0; i < trimmedString.length() / 2; i++) {
            if(trimmedString.charAt(i) != trimmedString.charAt(trimmedString.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
