package march_4_Assignment;

import java.util.Scanner;

public class sum_of_array_method {
	public static int sumOfArray(int size, int[] array) {
		int sum=0;
		for(int i=0; i<size; i++) {
			sum = sum + array[i];
		}
		System.out.println("Sum of array is "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		sumOfArray(size, array);
	}
}
