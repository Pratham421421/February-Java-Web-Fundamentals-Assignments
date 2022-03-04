package march_4_Assignment;

import java.util.Scanner;

public class element_present_array {
	public static int foundElement(int size, int toFind, int[] array) {
		for (int i = 0; i < size; i++) {
			if ((i+1) == toFind) {
				System.out.println("At index "+toFind+" Element is "+array[i]);
			}
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

		System.out.println("Enter Index");
		int toFind = sc.nextInt();
		
		foundElement(size, toFind, array);
	}

}
