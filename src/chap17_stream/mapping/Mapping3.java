package chap17_stream.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapping3 {
	
	public static void main( String[] args ) {
		
		문장스트림을단어스트림으로변환();
	}
	
	public static void 문장스트림을단어스트림으로변환() {
		
		List<String> list = new ArrayList<>();
		list.add( "this is java" );
		list.add( "i'm a best developer" );
		list.stream()

			// Arrays.stream() 메소드는 주어진 String[] 배열을 Stream<String> 으로 만든다. 
			.flatMap( str -> Arrays.stream( str.split( " " ) ) )
			
			.forEach( phrase -> System.out.println( phrase ) );

		List<String> numArr = Arrays.asList( "10, 20, 30", "40, 50" );
		
		System.out.println( numArr );
		
		numArr.stream().flatMapToInt( data -> {
			
			System.out.println( "data : " + data );
			String[] arr1 = data.split( "," );
			int[] intArr = new int[ arr1.length ];
			for( int i = 0; i < arr1.length; i++ ) {
				intArr[i] = Integer.parseInt( arr1[i].trim() );
			}
			return Arrays.stream( intArr );
		}).forEach( number -> System.out.println( number ) );
		
	}

}
