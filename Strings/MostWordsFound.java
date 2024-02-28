package Strings;

public class MostWordsFound {
    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int sumOfWords = 0;
        int max = 0;

        for(int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            for(@SuppressWarnings("unused") String s : words) {
                sumOfWords++;
            }
            max = Math.max(max, sumOfWords);
            sumOfWords = 0;
        }
        return max;
    }
}
