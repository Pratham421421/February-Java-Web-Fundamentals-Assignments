package HomeWork_Java;

import java.util.Scanner;

public class left_bottom_triangle_star {
	public static void main(String[] Pratham) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers of line: ");
		n=sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=i; j>1; j--) {
				System.out.print("* ");
			}
			System.out.println("* ");
		}
	}
}
