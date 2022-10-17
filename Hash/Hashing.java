// Java program to demonstrate working of HashTable
import java.util.*;

class Hashing {
	public static void main(String args[])
	{

		// Create a HashTable to store 
		// String values corresponding to integer keys
		Hashtable<String, String>
			hm = new Hashtable<>();

		// Input the values
		hm.put("C", "Geeks");
		hm.put("B", "forGeeks");
		hm.put("A", "A computer");

		// Printing the Hashtable
		System.out.println(hm);
	}
}
