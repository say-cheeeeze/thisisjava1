package chap17_stream.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Optional2 {
	
	public static void main( String[] args ) {

		try {
			System.out.println( "TEST1" );
			reduce1();
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		try {
			System.out.println( "TEST2" );
			reduce2();
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		
		
	}
	public static void reduce1() {
		
		List<Integer> list = new ArrayList<>();
		
		int sum = list.stream().reduce( ( a, b ) -> a + b ).get().intValue();
		
		System.out.println( sum );
		
	}
	public static void reduce2() {
		
		List<Integer> list = new ArrayList<>();
		
		int sum = list.stream().reduce( 0, ( a, b ) -> a + b );
		
		System.out.println( sum );
		
	}

}
