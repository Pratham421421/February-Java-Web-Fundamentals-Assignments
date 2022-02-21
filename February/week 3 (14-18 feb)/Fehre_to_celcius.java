package HomeWork_Java;

import java.util.Scanner;

public class Fehre_to_celcius {
	public static void main(String[] args) {
//		Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		double fahrenheit, celsius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Temperature fahrenheit: ");
		fahrenheit=sc.nextDouble();
		celsius = (fahrenheit-32)*5/9;
		System.out.print(fahrenheit+" F = "+celsius+" C");
	}
}
