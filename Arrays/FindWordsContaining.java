package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {
    public static void main(String[] args) {
        String[] list = {"leet", "code"};
        char x = 'e';
        
        List<Integer> result = findWordsContaining(list, x);

        System.out.print("[ ");
        for(int i = 0 ; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.print("]");
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int count = 0;

        for(String s: words) {
            if(s.indexOf(x) >= 0) {
                list.add(count);
            }
            count++;
        }
        return list;
    }
}
