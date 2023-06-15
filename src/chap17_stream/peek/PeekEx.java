package chap17_stream.peek;

import java.util.Arrays;

public class PeekEx {

	public static void main( String[] args ) {
		
		int[] intArr = { 1,2,3,4,5,6,7,8,9,10 };
		
		// 이 코드는 println 이 실행되지 않는다.
		// peek() 는 중간처리 과정이기 때문에 그 뒤에 최종처리 stream 메서드가 없다면 이 스트림을 실행되지 않는다.
		Arrays.stream( intArr ).peek( num -> System.out.println( num ) );
		
		// 2의 배수
		Arrays.stream( intArr ).filter( num -> num%2 == 0 ).forEach( num -> System.out.println( num ));
		
		// 2의 배수의 합
		int sum = 0;
		sum = Arrays.stream( intArr ).filter( num -> num%2 == 0 ).sum();
		System.out.println( "합 : " + sum );
		
		// 각 숫자마다 1 을 더해서 출력 looping
		System.out.println( "각 숫자마다 1 을 더해서 출력 looping" );
		Arrays.stream( intArr ).map( num -> num + 1 ).forEach( num -> System.out.println( num ) );
		
		
	}
}
