package Arrays;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] list = {"X++", "X--", "--X", "X--", "++X"};
        System.out.println(finalValueAfterOperations(list));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int counter = 0; 

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("--X") || operations[i].equals("X--")) {
                counter--;
            } else if (operations[i].equals("++X") || operations[i].equals("X++")) {
                counter++;
            }
        }
        return counter;
    }
}
