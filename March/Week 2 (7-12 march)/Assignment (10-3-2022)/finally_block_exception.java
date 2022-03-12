package march_10_Assignment;

public class finally_block_exception {
	public static void main(String[] args) {
		try {
			System.out.println("inside try block"); //this line will be print
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception"); //here is no exception so this line will not be print
		} finally
		{
			System.out.println("finally block"); //finally block always print
		}
	}
}
/*
 * Output: inside try block 
 *         finally block
 */
       
