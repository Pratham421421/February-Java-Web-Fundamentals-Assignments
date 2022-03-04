package march_4_Assignment;

import java.util.Scanner;

public class swap_two_numbers_array {
	public static int swap(int size, int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
		return size;
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
		System.out.println("Enter idex position you want to change (index starting from 0)");
		System.out.print("index: ");
		int firstIndex = sc.nextInt();
		System.out.print("index: ");
		int secondIndex = sc.nextInt();
		swap(size, array, firstIndex, secondIndex);
	}
}
