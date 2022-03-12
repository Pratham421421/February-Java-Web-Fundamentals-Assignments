package march_10_Assignment;

public class nested_try_exception {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int[] arr= {1,2,3,4,5};
		String name = null;
		try {
			try {
			int z = a/b;
			System.out.println("In first Try block");
			}
			catch(ArithmeticException ex1) {
				System.out.println(ex1.getMessage());
			}
			try {
				System.out.println(arr[6]);
				System.out.println("In second Try block ");
			}
			catch(IndexOutOfBoundsException ex2) {
				System.out.println(ex2.getMessage());
			}
			try {
				System.out.println(name.length());
				System.out.println("In third Try block");
			}
			catch(NullPointerException ex3) {
				System.out.println(ex3.getMessage());
			}
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Hello Geekster");
	}
}
