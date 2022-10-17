// Find the largest among the 3 numbers
class largest{
	static void large(int a, int b, int c){
		if(a > b && a > c){
			System.out.println("Value of a is geartest"+ a);
		}
		else if(b > c && b > a){
			System.out.println("Value of b is Geatest" + b);
		}
		else if(a == b || b == c || a == c){
			if(a == b){
				System.out.println("a and b value are equal");
			}
			else if(a == c){
				System.out.println("a and c values are equal");
			}
			else{
				System.out.println("b and c values are eqaul");
			}
		}
		else{
			System.out.println("c is the greatest value");
		}
			
	}
	public static void main(String[] args){
		large(5, 5, 2);
	}
}