package chap12.javabase.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Ex1 {
	public static void main( String[] args ) {
		
		// 올해 2023년 12월 31일까지 몇일이 남았는지?
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println( today );
		
		LocalDateTime lastDate = LocalDateTime.of( 2023, 12, 31, 0, 0, 0 );
		
		System.out.println( lastDate );
		
		long howmany = today.until( lastDate, ChronoUnit.DAYS );
		
		System.out.println( howmany );
	}
}
