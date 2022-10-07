class Factorial {
    public static int fact(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_n1 = fact(n-1);
        int fact_n = n * fact_n1;
        return fact_n;
    }
    public static void main(String args[]) {
        int factorial = fact(5);
        System.out.print(factorial);
    }
}