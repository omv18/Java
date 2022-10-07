class Fabonacci {
    public static void fabo(int a, int b , int c) {
        if( c == 0) return;
        int d = a + b;
        System.out.print(d + " ");
        fabo(b, d, c-1);
    }
    public static void main(String args[]) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int c = 7;
        fabo(a, b, c-2);
    }
}