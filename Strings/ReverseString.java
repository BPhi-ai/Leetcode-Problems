package Strings;

//only 'a','e','i','o','u' letters are reversed.

public class ReverseString {
    public static void main(String[] args) {
        String text = "hello";
        System.out.println(reverseString(text));
    }

    public static String reverseString( String s ){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
