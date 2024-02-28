package Strings;

public class RemoveVowels {
    public static void main(String[] args) {
        String test = "icecream";
        System.out.println(removeVowels(test));
    }

    public static String removeVowels(String text) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' ||
            text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                continue;
            }
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }
}
