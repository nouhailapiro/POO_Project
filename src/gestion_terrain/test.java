package gestion_terrain;

import java.util.Calendar;
import java.util.Date;

public class test {
	public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();

   
    calendar.set(Calendar.YEAR, 2024);
    calendar.set(Calendar.MONTH, Calendar.JANUARY); 
    calendar.set(Calendar.DAY_OF_MONTH, 7);
    calendar.set(Calendar.HOUR_OF_DAY, 20);
    calendar.set(Calendar.MINUTE, 0);
    calendar.set(Calendar.SECOND, 0);
    calendar.set(Calendar.MILLISECOND, 0);

    
    Date dateMatch1 = calendar.getTime();
    
    
}
}