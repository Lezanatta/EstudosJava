package Pck_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarTest {

	public static void main(String[] args)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2021-11-04T13:02:10Z"));
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		int minutos =  cal.get(Calendar.MINUTE);
		
		int mes = 1 + cal.get(Calendar.MONTH);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		
		//d = cal.getTime();
		
		
		System.out.println("Minutes: "+ minutos);
		System.out.println("Mês: "+ mes);
	}
}
