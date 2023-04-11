package chap01.print;

public class Print1 {
	
	public static void main( String[] args ) {
		
		/**
		 * prinf( "형식문자열", 값1, 값2, ... )
		 *
		 * 형식문자열 ( []는 생략가능 옵션 )
		 * => %[argument_index$] [flags] [width] [.precision] conversion
		 *          값의 순번      - 또는 0   전체자릿수  소수자릿수     변환문자
		 *
		 * conversion 은 값의 타입에 따라 d 는 정수, f 는 실수, s 는 문자열.
		 */
		
		System.out.printf( "%s", "s는 문자열을 의미함 이거 그대로 표현해달라는 거임" );
		System.out.println();
		
		System.out.printf( "이름 : %s", "김자바" );
		System.out.println();
		
		// 6자리 문자열, 왼쪽에 빈자리 공백
		System.out.printf( "%6s", "abc" );
		System.out.println();
		
		System.out.printf( "%13s", "abc123" );
		System.out.println();
		System.out.printf( "%13s", "something" );
		System.out.println();
		System.out.printf( "%13s", "soyung" );
		System.out.println();
		System.out.printf( "%13s", "cheeeeze" );
		System.out.println();
		System.out.printf( "%13s", "seeyou" );
		System.out.println();
		System.out.printf( "%13s", "happy111" );
		System.out.println();
		System.out.printf( "%13s", "proejcn11" );
		System.out.println();
		System.out.printf( "%13s", "816fyc" );
		
		// 왼쪽이 아니라 공백을 오른쪽으로 할거면 - 로 표기하면 됨
		System.out.printf( "%-13s", "userId123" );
		System.out.printf( "%-13s", "samwitwitcky" );
		System.out.println();
		
		// 실수
		// 정수 7자리 + 소수점 + 소수점 2자리, 공백은 왼쪽
		// ( 소수점은 반올림 )
		System.out.printf( "%10.2f", 123.456 );
		System.out.println();
		
		
		// 정수 7자리 + 소수점 + 소수점 2자리, 공백 오른쪽
		// ( 소수점은 반올림 )
		System.out.printf( "%-10.2f", 123.456 );
		System.out.println();
		
		
		// 정수 7자리 + 소수점 + 소수점 2자리, 공백 왼쪽이며 0 으로 채움
		System.out.printf( "%010.2f", 123.456 );
		System.out.println();
		
		
	}
}
