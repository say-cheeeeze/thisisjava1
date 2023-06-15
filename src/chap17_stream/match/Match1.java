package chap17_stream.match;

import java.util.Arrays;
import java.util.List;

public class Match1 {
	
	public static void main( String[] args ) {
		
		int[] intArr = { 2, 4, 6, 9, 10 };
		
		System.out.print( "모든 요소가 2의 배수인가?" );
		boolean t1 = Arrays.stream( intArr ).allMatch( i -> i % 2 == 0 );
		System.out.println( " => " + t1 );
		
		System.out.print( "하나라도 3 의 배수가 있는가?" );
		boolean t2 = Arrays.stream( intArr ).anyMatch( i -> i % 3 == 0 );
		System.out.println( " => " + t2 );
		
		System.out.print( "모든 요소가 12의 배수가 아닌가?" );
		boolean t3 = Arrays.stream( intArr ).noneMatch( i -> i % 12 == 0 );
		System.out.println( " => " + t3 );
		
		List<String> nameArr = Arrays.asList( "Michael Jordan", "Trae Young", "Shaquille O'Neal" );
		System.out.println( nameArr );
		System.out.println( "이름이 Michael 로 시작하는 사람이 있는가?" );
		boolean t4 = nameArr.stream().anyMatch( name -> name.startsWith("Michael") );
		System.out.println( " => : " + t4 );
	}

}
