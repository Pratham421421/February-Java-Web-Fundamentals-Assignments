package march_7_Assignment;

import java.util.Scanner;

public class swap_two_strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String secondName = sc.next();
		System.out.println("Before swapping: "+firstName+" "+secondName);
		
		firstName = firstName + secondName;
		secondName = firstName.substring(0, firstName.length()-secondName.length()); 
		firstName = firstName.substring(secondName.length());
		System.out.println("After swapping: "+firstName+" "+secondName);
	}
}
