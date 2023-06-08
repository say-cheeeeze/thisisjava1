package chap12.javabase.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx {
	
	public static void main( String[] args ) {
		
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy년 MM월 dd일 (D일째) E요일 a HH:mm:ss" );
		String strDate = sdf.format( new Date() ); // 2023년 06월 08일
		System.out.println( strDate );
	}
}
