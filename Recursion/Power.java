class Power {
    public static int printPower(int x, int n) {
        if( n == 0) return 1;
        if(x == 1) return 0;
         // logn 
        if(n % 2 == 0) { // even power
            return printPower(x, n/2) * printPower(x, n/2);
        }
        else { //odd power
            return x * printPower(x, n/2) * printPower(x, n/2);
        }

        // int xPow1 = calPower(x, n-1);
        // int xPow = x * xPow1;
        // return xPow;
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int ans = printPower(x, n);
        System.out.print(ans);
    }
}