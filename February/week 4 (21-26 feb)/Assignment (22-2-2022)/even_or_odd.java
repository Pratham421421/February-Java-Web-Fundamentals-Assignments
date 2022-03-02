package feb_22_Assignments;

import java.util.Scanner;

public class even_or_odd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}
}
