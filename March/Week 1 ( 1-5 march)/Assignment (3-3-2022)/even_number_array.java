package march_3_Assignment;

import java.util.Scanner;

public class even_number_array {
	public static void even(int[] array) {
		for(int i=0; i<10; i++) {
			if(array[i]%2==0) {
				System.out.println(array[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter numbers");
		for(int i=0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		even(array);
	}
}
