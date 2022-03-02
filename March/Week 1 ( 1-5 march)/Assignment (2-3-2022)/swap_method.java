package march_2_Assignment;

import java.util.Scanner;

public class swap_method {
	/*
	 * a=2 and b=4; we have to to a=4 and b=2;
	 * a=a+b; a=6
	 * b=a-b; b=4
	 * a=a-b; a=2
	 */
	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("After swaping : a = "+a+ " and b = "+b);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a = ");
	int a = sc.nextInt();
	System.out.print("Enter b = ");
	int b = sc.nextInt();
	System.out.println("Before swaping : a = "+a+ " and b = "+b);
	swap(a,b);
	}
}
