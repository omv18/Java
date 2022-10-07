class Get {
    public static void main(String args[]) {
        int n = 5;
        int position = 2;
        int bitMask = 1<<position;
        int result = (n & bitMask);
        
        if(result == 0) {
            System.out.println("Given 3rd bit of a number is 0");
        }
        else {
            System.out.println("Given 3rd bit of a number is 1");
        }
        System.out.print("Result after operation is = " + result);
    }
}