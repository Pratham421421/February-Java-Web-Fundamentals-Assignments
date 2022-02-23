package feb_18_to_19;

import java.util.Scanner;

public class sum_of_all_digits {
	//Write a program to calculate the sum of all digits in a number
	public static void main(String[] Pratham) {
		int n, sum=0, r, q;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		n = sc.nextInt();
		while(n>0) {
			r=n%10;		
			sum=sum+r;
			n=n/10;
			}
			System.out.print(sum);
	}
}
