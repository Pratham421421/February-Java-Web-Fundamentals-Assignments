package march_5_Assignment;

import java.util.Scanner;

public class remove_word_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line");
		String line = sc.nextLine();
		System.out.println("Which word you want to remove?");
		String word = sc.next();
		
		line = line.replaceAll(word, "");
		System.out.println(line);
	}
}
