package march_8_Assignment;

import java.util.Scanner;

public class lower_triangular_2DArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Row size");
		int r = sc.nextInt();
		System.out.println("Enter Column size");
		int c = sc.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter matrix elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		boolean found = true;
		for (int i = 0; i < r; i++) {
			int temp = 2;
			for (int j = i + 1; j < c; j++) {
				if (arr[i][j] != 0) {
					found = false;
				}
			}
		}
		if (found) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
}
