package Week_4;

import java.util.Scanner;

public class num_even_0_to_10 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		n = sc.nextInt();
		if(n>=0 && n<=10) {
			if (n%2==0) {
				System.out.print(n+" is even");
			}
			else {
				System.out.print("Please enter an even number");
			}
		}
		else {
			System.out.print("Please enter a number between 0 and 10 and even");
		}
	}
}