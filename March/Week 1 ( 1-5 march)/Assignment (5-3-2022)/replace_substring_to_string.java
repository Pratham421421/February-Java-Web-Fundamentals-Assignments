package march_5_Assignment;

import java.util.Scanner;

public class replace_substring_to_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line");  
		String line = sc.nextLine();
		System.out.println("Enter first word");   
		String firstWord = sc.next();
		System.out.println("Enter second word to replace "+firstWord);  
		String secondWord = sc.next();
		line = line.replaceAll(firstWord, secondWord);
		System.out.println(line);
	}
}
