package Strings;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
		StringBuilder sb = new StringBuilder();
		
		int minLen = Math.min(word1.length(), word2.length());
		int index = 0;
		
		while(index < minLen) {
			sb.append(word1.charAt(index));
			sb.append(word2.charAt(index));
			index++;
		}
		
		String remain = word1.length() >= word2.length() ? word1 : word2;
		
		while(index < remain.length()) {
			sb.append(remain.charAt(index));
			index++;
		}
		
		return sb.toString();
    }
}
