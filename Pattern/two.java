class two {
    public static void main(String args[]) {
        int m=0,n=4;
        for(int i=0; i<5; i++) {
            //for spaces
            for(int j=4; j>m; j--) {
                System.out.print("  ");  
            }
            m++;
            //for star
            for(int j=0; j<5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//         * * * * *       
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *