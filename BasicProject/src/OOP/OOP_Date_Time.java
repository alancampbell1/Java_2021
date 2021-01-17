package OOP;

/**
 * 
 * @author alancampbell
 * 
 * To use Date and Time in Java, we need the java.time package to get access to the Date Time API.
 * 
 * From here you can import specific date time classes to create  objects of them to use as you please.
 * For example:
 * 
 * - LocalDate         - Represents a date in yyyy-mm-dd
 * - LocalTime         - Represents a time in hr-min-sec-nanosec
 * - LocalDateTime     - represents both date and time
 * - DateTimeFormatter - display and parsing date-time objects
 * 
 */

import java.time.*;
import java.time.format.DateTimeFormatter;

public class OOP_Date_Time {
	
	public static void main(String [] args) {
		
		/** Local Date object to get Local Date	**/
		LocalDate myObj = LocalDate.now();
		System.out.println("The Local Date is " + myObj);
		
		/** Local Time object to get Local Time	**/
		LocalTime myObj2 = LocalTime.now();
		System.out.println("The local time is " + myObj2);
		
		/**	
		 * If you wanted for format date and time you can use the DateTimeFormatter Class with the
		 * ofPattern() method. 
		 * In the following example, we want to print the current date time in DD-MM-YYYY HH:MM:SS format
		 **/
		
		LocalDateTime myDateTimeObj = LocalDateTime.now();
		System.out.println("Before Date Time formatting: " + myDateTimeObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateTimeObj.format(myFormatObj);
		System.out.println("After Date Time formatting: " + formattedDate);
		
	}

}
