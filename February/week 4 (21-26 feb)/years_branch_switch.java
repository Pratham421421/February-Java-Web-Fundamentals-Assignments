package Week_4;

import java.util.Scanner;

public class years_branch_switch {
	public static void main(String[] args) {
		int year;
		String branch=null;
		String course = null;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Year (eg. 1,2,3,4): ");
		year=sc.nextInt();
		switch(year) {
		case 1:
			course="Every Courses related Subject in this year";
			break;
		case 2:
		case 3:
		case 4:
			System.out.print("Enter your branch (CSE, IT, CHEM, ME, ECE, EE, CE): ");
			branch=sc.next();
			switch(branch) {
			case "CSE", "IT":
				course="Computer Course";
				break;
			case "CHEM":
				course="Chemical Course";
				break;
			case "ME":
				course="Mechanical Course";
				break;
			case "ECE","EE":
				course="Electrical Course";
				break;
			case "CE":
				course="Civil Course";
				break;
			}
		break;
		default:
			course="Enter Valid Year or Branch";
		}
		System.out.print(course);
	}
}
