class Clear {
    public static void main(String args[]) {
        int n = 5;
        int bitMask = 1<<2;
        int norBitMask = ~(bitMask);
        int result = (norBitMask & n);
        System.out.println("Clear valur 3rd bit is = " + result);
    }
}