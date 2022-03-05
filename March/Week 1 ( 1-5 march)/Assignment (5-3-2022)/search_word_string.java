package march_5_Assignment;

import java.util.Scanner;

public class search_word_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter what you check");
		String check = sc.nextLine();
		boolean isFound = false;
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			int k = i;
			for (int j = 0; j < check.length(); j++) {
				if (name.charAt(k) != check.charAt(j)) {
					break;
				} else {
					count++;
					k++;
				}
			}
			if (count == check.length()) {
				isFound = true;
				break;
			}
		}
		if (isFound) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
	}
}
