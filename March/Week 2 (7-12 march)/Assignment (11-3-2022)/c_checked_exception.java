package march_11_Assignment;

public class c_checked_exception {
	//"What kind of checked or unchecked exception will the following programs throw, if any?
	/*c)What will be the output of the following program when run?
	public class Test 
	{
	public static void main(String[] args)
	{                
	try {
	 int value = 5;
	 if (value < 10)
	    throw new RuntimeException(""Value is less than 10"");
	 }
	catch (RuntimeException re) {
	   System.out.println(re.getMessage());
	  }
	System.out.println(""Outside try-catch block"");        
	  }
	}*/
	
	/*ans: first it enter in try block 
	 * value is 5 and is lesser than 10 then it throws exception and print "Value is less than 10"
	 * then it ignore catch
	 * and "print Outside try-catch block"
	 * 
	 * Output: Value is less than 10
	 *         Outside try-catch block
	 */
}
