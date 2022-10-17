public class primeNumbersFounder {
    
    public static boolean CheckPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int maxCheck = 100; // maxCheck limit till which you want to find prime numbers boolean isPrime ;

        //Empty String
        String primeNumbersFound = "";
        boolean isPrime;

        //Start loop 2 to maxCheck
        for (int i = 2; i <= maxCheck; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbersFound);
    }

}