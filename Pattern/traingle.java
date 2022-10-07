class triangle {
    public static void main(String args[]) {
        int n=5;

        //Patter 1
        // for (int i=0; i<n; i++) {
        //     for(int j=0; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // } 

        //pattern 2
        // int p=5;  
        // for (int i=0; i<n; i++) {
        //     for(int j=0; j<p; j++) {
        //         System.out.print("* ");
        //     }
        //     p-=1;
        //     System.out.println();
        // }

        //Pattern 3
        // for(int i=0; i<n; i++) {
        //     //for spaces
        //     for(int j=0; j<n-i;j++) {
        //         System.out.print("  ");
        //     }
        //     for(int j=0; j<=i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // } 
    }
}

// * 
// * *
// * * *
// * * * *
// * * * * *

// * * * * * 
// * * * *
// * * *
// * *
// *

//           * 
//         * *
//       * * *
//     * * * *
//   * * * * *