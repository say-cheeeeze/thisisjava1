package chap17_stream.ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		Set<String> set = new HashSet<>();
		set.add( "홍길동1" );
		set.add( "홍길동2" );
		set.add( "홍길동3" );
		
		Stream<String> stream1 = set.stream();
		stream1.forEach( name -> System.out.println( name ));
	}

}
