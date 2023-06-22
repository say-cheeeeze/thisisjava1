package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TTTT111 {
	
	public static void main( String[] args ) {
		
		System.out.println( LocalDateTime.now() );
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "yyyy년 MM월 dd일 HH:mm:ss" );
		String timeNow = now.format( formatter );
		System.out.println( timeNow );
	}

}
