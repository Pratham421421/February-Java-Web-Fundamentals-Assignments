package march_8_Assignment;

import java.util.Scanner;

public class sparse_matrix_2DArray {
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
		int zeroCount=0;
		int nonZeroCount=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(arr[i][j]==0) {
					zeroCount++;
				}
				else {
					nonZeroCount++;
				}
			}
		}
		if(zeroCount>nonZeroCount) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
