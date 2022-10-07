class Set {
    public static void main(String args[]) {
        int n = 5;
        int position = 1;
        int bitMask = 1<<position;
        int result = (n | bitMask);
        System.out.println("Set the second  bit to 1 is = " + result);
    }
}