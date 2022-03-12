package march_7_Assignment;

import java.util.Scanner;

public class smallest_and_biggest_palindrome_string {
	//this code refer from google but i undestood the logic of program
	
	public static boolean checkPalindrome(String word)
    {
  
        int n = word.length();          
        word = word.toLowerCase();       
        for (int i = 0; i < n; i++, n--)
        {
            if (word.charAt(i) != word.charAt(n - 1))
                return false;
        }
  
        return true;
    }
  
    public static void lengthPalindrome(int temp, String words[])
    {
        
        int count = 0;
        String smallest = "", longest = "";
        
        for (int i = 0; i < temp; i++) {           
            if (checkPalindrome(words[i])) {
                count++;                 
                if (count == 1)
                    smallest = longest = words[i];                
                else {                   
                    if (smallest.length()
                        > words[i].length())
                        smallest = words[i];                     
                    if (longest.length()
                        < words[i].length())
                        longest = words[i];
                }
            }
        }
  
        if (count == 0)
            
            System.out.println("Palindrome not found");
        
        else {
            
            System.out.println("Smallest palindrome is "
                               + smallest);
            System.out.println("Biggest palindrome is "
                               + longest);
        }
    }
  
    public static void main(String[] args) {    
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter Line");
        String line = sc.nextLine();
        String word = "";
        
        String[] words = new String[100];
        int temp = 0;
          
        line = line + " ";
  
        for (int i = 0; i < line.length(); i++) {
                       
            if (line.charAt(i) != ' ') {
                word = word + line.charAt(i);
            }           
            else {                     
                words[temp] = word;
                temp++;
                word = "";
            }
        }
        lengthPalindrome(temp, words);
    }
}
