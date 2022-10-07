import java.util.*;

class Update {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        System.out.print("Enter the 0 or 1 = ");
        int input = sc.nextInt();
        System.out.print("Enter the Position to change = ");
        int pos = sc.nextInt();
        int position = pos - 1;
        int bitMask = 1<<position;
        int norBitMask = ~(bitMask);
        int result;
        if(input == 0) {
            result = (norBitMask & n);
            System.out.println("Update the " + pos + " bit of a number " + n + " to " + input + " is = " + result);
        }
        else {
            result = (bitMask | n);
            System.out.println("Update the " + pos + " bit of a number " + n + " to " + input + " is = " + result);
        }
    }
}