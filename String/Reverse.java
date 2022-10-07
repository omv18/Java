import java.util.*;

class Reverse {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++) {
            int first = i;
            int last = sb.length() - 1 - i;
            
            char char1 = sb.charAt(first);
            char char2 = sb.charAt(last);

            sb.setCharAt(first, char2);
            sb.setCharAt(last, char1);
        }
        System.out.print("String Reverse is " + sb);
    }
}