package feb_28_Assignments;

import java.util.Scanner;

public class multi_of_int_float_double_method {
	public static void multiInt(int a, int b) {
		System.out.println(a + " x " + b + " = " + (a * b));
	}

	public static void multiFloat(float a1, float b1) {
		System.out.println(a1 + " x " + b1 + " = " + (a1 * b1));
	}

	public static void multiLong(long a2, long b2) {
		System.out.println(a2 + " x " + b2 + " = " + (a2 * b2));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("choose method:");
		System.out.println("For Int : 1");
		System.out.println("For Float : 2");
		System.out.println("For Long : 3");
		int method = sc.nextInt();

		switch (method) {

		case 1:
			System.out.println("First number");
			int a = sc.nextInt();
			System.out.println("First number");
			int b = sc.nextInt();
			multiInt(a, b);
			break;
		case 2:
			System.out.println("First number");
			float a1 = sc.nextFloat();
			System.out.println("First number");
			float b1 = sc.nextFloat();
			multiFloat(a1, b1);
			break;
		case 3:
			System.out.println("First number");
			long a2 = sc.nextLong();
			System.out.println("First number");
			long b2 = sc.nextLong();
			multiLong(a2, b2);
			break;
		default:
			System.out.println("Invalid method");
		}
	}
}
