package march_8_Assignment;

import java.util.Scanner;

public class frequency_of_odd_even_2DArray {
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
		int even=0;
		int odd=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(arr[i][j]%2==0) {
					even++;
				}
				else {
					odd++;
				}
			}
		}
		System.out.println("Frequency of even numbers: "+even);
		System.out.println("Frequency of even numbers: "+odd);
	}
}
