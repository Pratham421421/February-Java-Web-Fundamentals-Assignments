package feb_28_Assignments;

import java.util.Scanner;

public class calculator_method {
	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public static void diff(int a, int b) {
		int diff = a - b;
		System.out.println(diff);
	}

	public static void multi(int a, int b) {
		int multi = a * b;
		System.out.println(multi);
	}

	public static void div(int a, int b) {
		int div = a / b;
		System.out.println(div);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Substraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		int n = sc.nextInt();

		if (n > 0 && n <= 4) {
			System.out.print("Enter First Number: ");
			int a = sc.nextInt();
			System.out.print("Enter Second Number: ");
			int b = sc.nextInt();

			switch (n) {
			case 1:
				add(a, b);
				break;
			case 2:
				diff(a, b);
				break;
			case 3:
				multi(a, b);
				break;
			case 4:
				div(a, b);
				break;
			}
		} else {
			System.out.print("Invalid Method");
		}
	}

}
