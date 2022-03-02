package march_2_Assignment;

import java.util.Scanner;

public class fibonacii_method {
	/*
	 * fibonacii series: 0 1 1 2 3 5 8 13 .....
	 * a=0, b=1 ; ans=a+b=1 ; a=b, b=ans; ans=1+1=2; ans=1+2=3
	 */
	public static void fibonacii(int count) {
		int a=0, b=1;
		System.out.print(a+" "+b+" ");
		while((count-2)>0) {
			int ans = a+b;
			System.out.print(ans+" ");
			a=b;
			b=ans;
			count--;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count");
		int count = sc.nextInt();
		fibonacii(count);
	}
}
