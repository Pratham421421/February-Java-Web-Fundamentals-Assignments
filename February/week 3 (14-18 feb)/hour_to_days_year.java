package HomeWork_Java;

import java.util.Scanner;

public class hour_to_days_year {
	public static void main(String[] Pratham) {
//		Write a Java program to take the number input from user in hours and convert it into a number of days and years
//		1 hour - 0.0416667 day
//		1 hour = 0.000114155 year
		
		double hour, day, year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter hours: ");
		hour=sc.nextDouble();
		day=0.0416667*hour;
		year=0.000114155*hour;
		System.out.println(hour+" hours = "+day+" days");
		System.out.println(hour+" hours = "+year+" year");
	}
}
