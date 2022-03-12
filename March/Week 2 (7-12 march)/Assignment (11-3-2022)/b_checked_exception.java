package march_11_Assignment;

public class b_checked_exception {
	// "What kind of checked or unchecked exception will the following programs
	// throw, if any?
	/*
	 * public static void main(String[] args) { 
	 * byte num;
	 * System.out.println("Scientech");
	 *  num = Byte.parseByte("Easy");
	 * System.out.println("num: " + num); }
	 */
	public static void main(String[] args) {
		byte num;
		System.out.println("Scientech"); //Scientech will be print
		try {
		num = Byte.parseByte("Easy");  // here is exception i.e NumberFormatException
		System.out.println("num: " + num);
		}
		catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
