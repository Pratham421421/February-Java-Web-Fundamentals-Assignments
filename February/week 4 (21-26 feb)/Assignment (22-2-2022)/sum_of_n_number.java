package feb_22_Assignments;

import java.util.Scanner;

public class sum_of_n_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int i=1, sum=0;
		while(i<=n) {
			sum=sum+i;
			i++;
		}
		System.out.print("Sum is "+sum);
	}
}
