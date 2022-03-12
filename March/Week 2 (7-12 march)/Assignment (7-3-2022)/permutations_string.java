package march_7_Assignment;

import java.util.Scanner;

public class permutations_string {
	static void printPermutation(String s, String ans) {
        if (s.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
            String s1 = s.substring(0, i) + s.substring(i + 1);
            printPermutation(s1, ans + ch);
        }
    }
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String s = sc.nextLine();
		 printPermutation(s, "");
	}
}
