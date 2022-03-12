package march_10_Assignment;

public class try_and_catch_exception {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			System.out.println(a/b); //here is exception so we have to catch
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage()); // here we catch exception
		}
		System.out.println("Hello Geekster"); //by handling exception this line will be print
	}
}
