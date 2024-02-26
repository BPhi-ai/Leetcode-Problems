package Strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] alpha = new int[26];
        for(int a = 0; a < s.length(); a++) {
            alpha[s.charAt(a) - 'a']++;
        }
        for(int b = 0; b < t.length(); b++) {
            alpha[t.charAt(b) - 'a']--;
        }

        for(int i: alpha) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
