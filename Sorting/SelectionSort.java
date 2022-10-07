class SelectionSort {
    // static int swap = 0;
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {9,3,1,6,3,4,25,9};
        for(int i=0; i<arr.length - 1; i++) {
            int smallest = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // for (int k=0; k<arr.length; k++) {
        //     System.out.print(arr[k]);
        // }
        printArray(arr);
    }
}