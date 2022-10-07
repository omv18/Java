class BubbleSort {
    static int swap = 0;
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {9,3,1,6,3,4,25,9};
        for(int i=0; i<arr.length - 1; i++) {
            for(int j=0; j<arr.length - 1 -i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = 1;
                }
            }
            if(swap == 0) {
                System.out.println("Array is already Sorted");
                break;
            }
        }
        // for (int k=0; k<arr.length; k++) {
        //     System.out.print(arr[k]);
        // }
        printArray(arr);
    }
}