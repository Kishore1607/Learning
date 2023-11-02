package StringSums;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = "9999-12-29";

	        try {

	            // ResolverStyle.STRICT for 30, 31 days checking, and also leap year.
	            LocalDate.parse(date,
	                    DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT)
	            );

	            System.out.println(true);

	        } catch (DateTimeParseException e) {
//	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }

	          
	}

}