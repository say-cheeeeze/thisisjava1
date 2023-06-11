package chap15_collection.list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	
	public static void main( String[] args ) {
		
		List strArr = new ArrayList();
		strArr.add( "test" );
		strArr.add( "test" );
		strArr.add( "test" );
		strArr.add( 10 );
		
		System.out.println( strArr );
		
		for( int i = 0; i < strArr.size(); i++ ) {
			System.out.println( strArr.get( i ) );
		}
	}

}
