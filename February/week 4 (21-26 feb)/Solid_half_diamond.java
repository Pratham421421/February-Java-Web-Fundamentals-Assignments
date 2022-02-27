package Week_4;

import java.util.Scanner;

public class Solid_half_diamond {
	public static void main(String[] args) {
		int n, j, i, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines: ");
		n = sc.nextInt();
		for(i=1; i<=(n+1)/2; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
		for(i=n/2; i>=1; i--) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
