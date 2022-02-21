package HomeWork_Java;

import java.util.Scanner;

public class body_mass_index {
	public static void main(String[] args) {
//		Write a Java program to compute body mass index (BMI)
		double w,h;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Weight(Kg): ");
		w=sc.nextDouble();
		System.out.print("Enter Height(m): ");
		h=sc.nextDouble();
		double bmi= w/(h*h);
		System.out.print("Body Mass Index (BMI) is: "+bmi+" Kg/m2");
	}	
}
