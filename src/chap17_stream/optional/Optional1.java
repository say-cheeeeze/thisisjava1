package chap17_stream.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Optional1 {
	
	public static void main( String[] args ) {
		
		List<Integer> list = new ArrayList<>();
		
		/*
		 java.util.NoSuchElementException 발생
		 
		 double avg = list.stream().mapToInt( Integer::intValue ).average().getAsDouble();
		 System.out.println( avg );
		 
		 */
		
		System.out.println( "###### 방법1" );
		OptionalDouble optional = list.stream().mapToInt( Integer::intValue ).average();
		
		System.out.println( "isPresent ? : " + optional.isPresent() );
		
		if ( optional.isPresent() ) {
			System.out.println( "평균 계산 가능" );
			
			double avg = optional.getAsDouble();
			System.out.println( avg );
		}

		System.out.println( "###### 방법2" );
		double avg1 = list.stream().mapToInt(Integer::intValue ).average().orElse( 0.0 );
		System.out.println( "평균 : " + avg1 );

		
		System.out.println( "###### 방법3" );
		list.stream().mapToInt( Integer::intValue ).average().ifPresent( num -> System.out.println( num ) );
		
	}

}
