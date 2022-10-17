// Program to find the given integer is odd or even
class EvenOdd{
	static void checkNumber(int m){
		if(m % 2 == 0){
			System.out.println("Number is EVEN");
		}
		else{
			System.out.println("Number is ODD");
		}
	}
	public static void main(String[] args){
		checkNumber(2);	
	}
}