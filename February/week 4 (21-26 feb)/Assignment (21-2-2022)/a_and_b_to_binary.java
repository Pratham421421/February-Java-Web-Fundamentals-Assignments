package Week_4;

import java.util.Scanner;

public class a_and_b_to_binary {
	public static void main(String[] args) {
		/*
		 * a=17 (10001)
		 * b=9  (01001)
		 * AND(&) 10001 & 01001 = 00001 = 1
		 * OR(/)  10001 | 01001 = 11001 = 25
		 * XOR(^) 10001 ^ 01001 = 11000 = 24
		 */
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a= ");
		a = sc.nextInt();
		System.out.print("Enter b= ");
		b = sc.nextInt();
		System.out.println(a + " & " + b + " = " + (a & b));
		System.out.println(a + " | " + b + " = " + (a | b));
		System.out.println(a + " ^ " + b + " = " + (a ^ b));
	}
}
