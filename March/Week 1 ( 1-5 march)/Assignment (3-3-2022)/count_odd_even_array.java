package march_3_Assignment;

import java.util.Scanner;

public class count_odd_even_array {
	public static void main(String[] args) {
		int evenCount = 0, oddCount = 0, i;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter numbers");
		for (i = 0; i < 10; i++) {
			array[i] = sc.nextInt();
		}
		for (i = 0; i < 10; i++) {
			if (array[i] % 2 == 0) {
				evenCount++;
			} 
			else {
				oddCount++;
			}
		}
		System.out.println("Even : " + evenCount);
		System.out.println("Odd : " + oddCount);
	}
}
