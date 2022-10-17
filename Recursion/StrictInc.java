class StrictInc {
    public static boolean isSorted(int idx, int arr[]) {
        if(idx == arr.length-1) {
            return true;
        }

        if(arr[idx] >= arr[idx+1]) {
            return false;
        }
        return isSorted(idx+1, arr);
    }
    public static void main(String args[]) {
        int arr[] = {1,34,5,88,99};
        System.out.print(isSorted(0,arr));

    }
}