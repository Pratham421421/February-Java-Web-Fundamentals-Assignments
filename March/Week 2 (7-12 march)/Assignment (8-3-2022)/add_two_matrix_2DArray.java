package march_8_Assignment;

import java.util.Scanner;

public class add_two_matrix_2DArray {
	
	static void fiiElementsMatrix1(int r, int c, int[][] a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first matrix elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}
	static void fiiElementsMatrix2(int r, int c, int[][] b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter second matrix elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				b[i][j] = sc.nextInt();
			}
		}
	}
	
	static void addResult(int[][] a, int[][] b, int r, int c) {
		int[][] add = new int[r][c];
		System.out.println("The result matrix is:");
		for(int i=0; i<add.length; i++) {
			for(int j=0; j<add[0].length; j++) {
				add[i][j] = a[i][j] + b[i][j];
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Row size");
		int r = sc.nextInt();
		System.out.println("Enter Column size");
		int c = sc.nextInt();
		int[][] a = new int[r][c];
		fiiElementsMatrix1(r, c, a);
		
		int[][] b = new int[r][c];
		fiiElementsMatrix2(r, c, b);
		
		addResult(a,b,r,c);
	}
}
