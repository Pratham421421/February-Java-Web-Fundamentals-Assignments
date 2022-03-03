package march_3_Assignment;

import java.util.Scanner;

public class multi_by_factor_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter multification factor");
		int d = sc.nextInt();
		
		int[] array = new int[10];
		System.out.println("Enter numbers");
		for(int i=0; i<10; i++) {
			array[i] = sc.nextInt();
		}
		for(int i=0; i<10; i++) {
			int ans = array[i]*d;
			System.out.println(array[i]+" x "+d+" = "+ans);
		}
	}
}
