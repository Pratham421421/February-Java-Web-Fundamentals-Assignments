package feb_24_Assignment;

import java.util.Scanner;

public class diamond_pattern {
	public static void main(String[] args) {
		int n, j, i;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines: ");
		n = sc.nextInt();
		int st = 1, sp = n / 2;
		if (n % 2 != 0) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= sp; j++) {
					System.out.print(" ");
				}
				for (j = 1; j <= st; j++) {
					System.out.print("*");
				}
				if (i <= n / 2) {
					sp--;
					st += 2;
				} else {
					sp++;
					st -= 2;
				}
				System.out.println();
			}
		} else {
			System.out.print("Please Enter odd number for perfect diamond");
		}
	}
}
