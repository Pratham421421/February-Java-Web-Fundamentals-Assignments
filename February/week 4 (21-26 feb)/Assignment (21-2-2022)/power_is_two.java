package feb_21_Assignments;

import java.util.Scanner;

public class power_is_two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		int save = n;
		while(n%2==0) {
			n = n/2;
		}
		if(n==1) {
			System.out.println(save+" is power of 2");
		}
		else {
			System.out.println(save+" is not power of 2");
		}
	}
}
