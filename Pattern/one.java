class one {
    public static void main(String args[]) {
        for(int i=4;i>=1;i--) {
            //for *
            for(int j=4;j>=i;j--) {
                System.out.print("* ");
            }
            //for Spaces
            int m=2*(i-1);
            for(int j=1; j<=m; j++) {
                System.out.print("  ");
            }
            //for *
            for(int j=4;j>=i;j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower half
        for(int i=4;i>=1;i--) {
            int m=2*(4-i);
            //for *
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            //for Spaces
            for(int j=1; j<=m; j++) {
                System.out.print("  ");
            }
            m=m+2;
            //for *
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// *             * 
// * *         * *
// * * *     * * *
// * * * * * * * *
// * * * * * * * *
// * * *     * * *
// * *         * *
// *             *