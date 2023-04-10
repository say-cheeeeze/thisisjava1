package chap01.variableType;

public class Variable1 {
	
	public static void main( String[] args ) {
		
		/**
		 * 기본형 변수 primitive type variable
		 *
		 * 정수는 byte, short, char, int, long 이렇게 5가지가 있다.
		 * 실수는 float, double 2가지.
		 * 논리형은 boolean
		 *
		 * 값의 허용범위를 외울 필요는 없지만
		 * 메모리 할당 크기는 알아야함.
		 * byte : 8bit. -127 ~ 128
		 * short : 2 byte. 16bit. -32.768 ~ 32.767
		 * char : 2 byte. 16bit. 0 ~ 65536 유니코드
		 * int 는 4 byte. 32bit.
		 * long 은 8 byte. 64bit.
		 *
		 * 메모리 허용크기 작은 것부터 센다면
		 * byte(1byte, 8bit) -> short, char(2byte, 16bit) -> int (4byte, 32bit) -> long(8byte, 64bit)
		 *
		 * char 를 제외한 byte, short, int, long 은 모두 부호있는 정수타입이다.
		 * 최상위 bit 는 부호 bit 로 사용되고, 나머지 bit 는 값의 범위를 결정한다.
		 * 부호 bit 는 양수는 0, 음수는 -1 을 결정한다.
		 */
		
		// 정수리터럴
		
		// 2진수는 0b 또는 0B 로 시작하고 0과 1 로 표현
		int x1 = 0b1011;
		// 1x2의3승 + 0x2의2승 + 1x2의1승 + 1x2의0승 = 8 + 2 + 1 = 11
		
		int x2 = 0B01111111111111111111111111111111;
		
		System.out.println( x1 ); // 11
		System.out.println( x2 ); // 2147483647
		
		// 8진수 : 0 으로 시작하고 0~7 로 표현
		int y1 = 013;
		System.out.println( y1 ); // 처음 0은 8진수를 뜻하고, 1x8의1승 + 3x8의0승 = 11
		
		int y2 = 00400;
		// 처음 0은 8진수를 뜻하고, 0x 8의 3승 + 4 x 8의2승 + 0 x 8의1승 + 0 x 8의0승
		// = 0 + ( 4 * 64 ) + 0 + 0 = 256
		System.out.println( y2 );
		
		// 8진수로 300 만들기
		int y3 = 00454;
		System.out.println( y3 );
		
		// 10진수는 소수점 없이 0~9 숫자로 표현
		
		// 16진수는 0x 또는 0X 로 시작하고 0~9 숫자 와 ABCDEF 또는 abcdef 로 표현(a가 10)
		int z1 = 0Xa1;
		System.out.println( z1 ); // 몇일거같애 a 는 10이니까 11 ?
		// 아....첫자리는 16의 1승이니까 16 x 10 + 16 의 0승 * 1 = 160 + 1 = 161
		
		// 16진수로 256 을 만들어보셈
		int z2 = 0x100;
		System.out.println( z2 );
		
		// 2진수로 11 는?
		int q1 = 0b1011;
		System.out.println( q1 );
		
		// 8진수로 134
		int q2 = 0206;
		System.out.println( q2 );
		
		// 16진수로 179
		int q3 = 0Xb3; // 11 * 16 + 3 * 1(16의0승) = 179
		System.out.println( q3 );
		
		
		// 컴파일러는 기본적으로 정수리터럴을 int 로 간주하기 때문에
		// long 타입을 선언하려면 l 이나 L 을 붙여 long 타입임을 컴파일러에게 알려주어야한다.
		// int long1 = 10000000000; //Integer number too Large
		long long2 = 100000000000L;
		System.out.println( long2 );
	}
}
