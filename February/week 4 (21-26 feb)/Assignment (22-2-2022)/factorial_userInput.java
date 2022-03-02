package feb_22_Assignments;

import java.util.Scanner;

public class factorial_userInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i=1, fact=1;
		System.out.println("You want to continue?");
		System.out.println("Y/N");
		char select = sc.next().charAt(0);
		switch(select) {
		case 'Y':
			while(i<=n) {
				fact = fact*i;
				i++;
			}
			System.out.println("Factorial is "+fact);
			break;
		case 'N':
			System.out.println("Thank you!");
			break;
			default:
				System.out.println("Enter Y/N only");
		}
		
	}
}
