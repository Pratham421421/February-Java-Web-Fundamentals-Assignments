package HomeWork_Java;

import java.util.Scanner;

public class divsible_by_3 {
	public static void main(String[] Pratham) {
		int n, i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lat number: ");
		n=sc.nextInt();
		while(i<n) {
			if(i%3==0 && i!=0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
