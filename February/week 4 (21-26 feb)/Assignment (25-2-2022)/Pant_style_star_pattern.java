package Week_4;

import java.util.Scanner;

public class Pant_style_star_pattern {
	public static void main(String[] args) {
		int n, j, i, s = 0, k;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines: ");
		n = sc.nextInt();
		for (i = n; i >= 1; i-- ) 
		{
			for (j = 1 ; j <= i; j++ ) 
			{
				System.out.print("*");

			}
			for (k = 1 ; k <= 2 * (n - i); k++ ) 
			{
				System.out.print(" ");
			}
			for (int l = 1 ; l <= i; l++ ) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
