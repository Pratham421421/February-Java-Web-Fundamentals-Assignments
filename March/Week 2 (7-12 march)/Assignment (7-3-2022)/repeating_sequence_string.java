package march_7_Assignment;

import java.util.Scanner;

public class repeating_sequence_string {
	public static String longestprefix(String s1, String s2) {
		int length = Math.min(s1.length(), s2.length());
		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return s1.substring(0, i);
			}
		}
		return s1.substring(0, length);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String s1 = sc.nextLine();
		String s2 = "";

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i + 1; j < s1.length(); j++) {
				String s3 = longestprefix(s1.substring(i, s1.length()), s1.substring(j, s1.length()));
				if (s3.length() > s2.length()) {
					s2 = s3;

				}
			}
		}
		System.out.println("Longest Sequence is: " + s2);
	}
}
