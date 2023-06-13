package chap15_collection.collection.synchronizemethod;

import java.text.ParsePosition;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.List;

public class DateParseTest {

	public static void main( String[] args ) {
		
		for( int month = 1; month < 14; month++ ) {
			for( int day = 1; day < 33; day++ ) {
				StringBuilder sb = new StringBuilder();
				sb.append( "2023" ).append("-");
				System.out.println( String.valueOf( month ).length() );
				if ( String.valueOf( month ).length() == 1 ) {
					sb.append( "0" );
				}
				sb.append( String.valueOf( month ) );
				sb.append( "-" );
				if ( String.valueOf( day ).length() == 1 ) {
					sb.append( "0" );
				}
				sb.append( String.valueOf( day ) );
				String date = sb.toString();
				System.out.println( date );
				System.out.println( date + " 됨 ? : " + solution( date ) );
			}
		}
		
//		String strDate = "2023-02-28";
//		boolean isValidDate = solution( strDate );
		
//		System.out.println("isValidDate : " + isValidDate );
	}
	
	public static boolean solution( String param ) {

		ParsePosition pp = new ParsePosition(0);
        TemporalAccessor t = 
            DateTimeFormatter.ofPattern("uuuu-MM-dd")
             .withResolverStyle(ResolverStyle.STRICT)
             .parseUnresolved(param, pp);
        System.out.println("Info! " + t + "/" + pp); // note, no error in pp here!
        // Info! {DayOfMonth=29, MonthOfYear=2, Year=2015},null,null/java.text.ParsePosition[index=10,errorIndex=-1]
        boolean leapyear = Year.from(t).isLeap();
        
        MonthDay md = MonthDay.from(t);

        System.out.println( "leapyear : " + leapyear );
        System.out.println( "md.getDayOfMonth() : " + md.getDayOfMonth() );
        
        if ( md.getDayOfMonth() > 31  ) {
            System.out.println("Error! 31"); // hand-made validation covering a special case
        	return false;
        }
        
        if (!leapyear && md.getMonth().getValue() == 2) {
            System.out.println("Error!"); // hand-made validation covering a special case
            return false;
        }
        return true;
	}
}
