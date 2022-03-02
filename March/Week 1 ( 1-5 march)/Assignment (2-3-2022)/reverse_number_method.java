package march_2_Assignment;

import java.util.Scanner;

public class reverse_number_method {
	public static void reverse(int n) {
		while(n>0) {
			int r = n%10;
			System.out.print(r);
			n = n/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		reverse(n);
	}
}
