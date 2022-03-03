package march_3_Assignment;

import java.util.Scanner;

public class middle_element_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int s = sc.nextInt();
		int save = s;
		int[] nums = new int[s];
		System.out.println("Enter numbers");
		for(int i=0; i<s; i++) {
			nums[i] = sc.nextInt();
		}
		s = s/2;
		if(save%2==0) {
			System.out.print(nums[s-1]+ " and ");
		}
		System.out.print(nums[s]);
		
	}
}
