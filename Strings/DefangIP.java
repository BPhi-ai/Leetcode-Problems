package Strings;

public class DefangIP {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(char c: address.toCharArray()) {
            if(c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
