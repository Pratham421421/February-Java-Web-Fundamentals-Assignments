package march_3_Assignment;

import java.util.Scanner;

public class sum_of_elements_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter elements");
		int[] elements = new int[10];
		for(int i=0; i<10; i++) {
			elements[i] = sc.nextInt();
			sum = sum + elements[i];
		}
		System.out.println("Sum of all elements is "+sum);
	}
}
