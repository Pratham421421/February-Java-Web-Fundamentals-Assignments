package feb_24_Assignment;

import java.util.Scanner;

public class left_triangle_pattern {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("How many lines: ");
		n = sc.nextInt();
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
