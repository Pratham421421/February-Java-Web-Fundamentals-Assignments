package HomeWork_Java;

import java.util.Scanner;

public class left_triangle_star_pattern {
	public static void main(String[] Pratham) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers of line: ");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("* ");
		}
	}
}
