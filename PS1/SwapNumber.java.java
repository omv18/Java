class SwapNumber {
    
    static void swapValueUsingThirdVariable(int m, int n){
        System.out.println("Swap the variable using third value");
        int temp = m;
        m = n;
        n = temp;
        System.out.println("value of m = "+ m +" and Value of n = " + n);
    }
    static void swapValuesWithoutUsingThirdVariables(int m, int n){
        System.out.println("Swap the value without using third variables");
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("value of m = "+ m +" and Value of n = " + n);
    }
    
    public static void main(String[] args) {
        swapValueUsingThirdVariable(2 , 3);
        swapValuesWithoutUsingThirdVariables(2,3);
    }
}