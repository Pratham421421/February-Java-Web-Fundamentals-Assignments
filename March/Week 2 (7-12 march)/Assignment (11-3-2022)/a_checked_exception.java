package march_11_Assignment;

public class a_checked_exception {
	// "What kind of checked or unchecked exception will the following programs
	// throw, if any?
/*	a) public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int z = x / y;
		System.out.println(z);
	}*/
	
	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		try {
		int z = x / y; //here is Arithmetic exception bcz z=10/0=not define so here we use try and catch
		System.out.println(z);
		}
		catch(ArithmeticException ex) {
			System.out.println(ex.getMessage());
		}		
	}
}