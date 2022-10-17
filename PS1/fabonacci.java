import java.util.Scanner; 

class fabonacci {
    static void fabNum(int n){
        int max = n * 2 + 5;
        int arr[] = new int[max];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < max ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.print("Fabonacci Series upto value = " + n +  " is " );
        for(int j = 0; j < max; j++){
            System.out.print(arr[j] + " " );
        }
        System.out.println();
        int Sum = 0, p = 0,k=0;
        while(p<=n){
            
            Sum += arr[k];
            k+=2;
            p++;
        }

        System.out.println("Sum is = " + Sum);
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Value = ");
        int input = myObj.nextInt(); 
        System.out.println("Input value is: " + input); 
        fabNum(input);
    }
    
}