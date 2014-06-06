
import java.time.*;
import java.time.format.DateTimeFormatter;


public class PrintCurrentDateTime {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		
    	// Choose format    	
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm");
    	String dateFormat = date.format(formatter);
    	
    	// Print Date and Time
    	System.out.println(dateFormat);
	}

}
