package feb_24_Assignment;

import java.util.Scanner;

public class pyramid_pattern {
	public static void main(String[] args) {
		int n, j, i, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines: ");
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			for(j=(n-1); j>=i; j--) {
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
