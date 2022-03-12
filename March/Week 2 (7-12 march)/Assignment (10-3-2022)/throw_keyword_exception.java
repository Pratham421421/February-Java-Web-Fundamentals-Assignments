package march_10_Assignment;

public class throw_keyword_exception {
	public static void main(String[] args) {
		int x = 100;
		int y = 2;
		try {
			int z = x/y;
			System.out.println(z);
			throw new ArithmeticException("throw exception"); //throw always write in try block
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Hello World");
	}
}
