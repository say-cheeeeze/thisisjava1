package chap01.variabletype;

public class Casting {
	
	/**
	 * 강제타입 변환
	 *
	 * 큰 허용범위를 작은 허용범위 타입으로 '바꾼다고 명시'하여 타입을 변환할 수 있다.
	 * => 큰 녀석을 작은 그릇으로 Casting 한다.
	 */
	public static void main( String[] args ) {
	
//		intToByte();

//		intToByte2();
		
//		longToInt();
		
//		intToChar();
		
		TypeCasting();
	}
	
	public static void intToByte() {
		/**
		 * int 를 byte 로 타입캐스팅한다.
		 * 4바이트 그릇을 1바이트짜리 그릇으로 옮긴다.
		 */
		int int1 = 100;
		byte byte1 = (byte)int1;
		System.out.println( byte1 );
	}
	
	public static void intToByte2() {
		/**
		 * 만약 허용범위 차이에 의해 손실값이 생긴다면 어떻게 될까?
		 */
		int int1 = 250;
		byte byte1 = ( byte )int1;
		System.out.println( byte1 ); // -6 이 나온다.
		
		// 10진수 250 은 2진수로 나타내면 0b11111010 1바이트로 표현이 가능하다.
		// 근데 byte 로 변환하면 11111010 는 ~128 ~ 127 만 표현가능한 범위 안에서
		// 부호bit 1 을 처리하고 나머지 수들은 1의 모수로 변경되기 때문에 -6 이 된다.
		
		// 타입캐스팅의 목적은 원래 값을 유지하면서 타입만 변경하는 건데
		// 이렇게 하면 값을 손실하게 된다.
		
		// byte 로 변환한다면 ~128 ~ 127 의 int 값만 원래 값을 보존하며 타입을 변경할 수 있다.
	}
	
	public static void longToInt() {
		
		/**
		 * long 을 int 로
		 * long 을 int 로 변환하면 앞의 4바이트는 버려지고
		 * 뒤의 4byte 만 int 타입 변수로 저장된다.
		 */
		long long1 = 300;
		int int1 = (int)long1;
		
		System.out.println( int1 );
		
	}
	
	public static void intToChar() {
		
		/**
		 * int 는 char 보다 더 큰 허용범위를 가진다.
		 * (char) 를 통해 변환가능하지만 char 는 0~65535 사이의 값만 원래 값을 유지한다.
		 */
		int int1 = 65535;
		char char1 = (char)int1;
		
		System.out.println( char1 );
		
	}
	
	public static void TypeCasting() {
		/**
		 * java 는 실행 성능 향상을 위해 컴파일 단계에서 연산을 수행한다.
		 * 정수 리터럴을 연산해서 직접 byte 타입에 저장할 때에는 덧셈 연산이 컴파일 때에 일어난다.
		 */
		// 정상적인 컴파일될 코드. result 에는 30이 할당된다.
		byte result = 10 + 20;
		
		/**
		 * 그런데 정수 리터럴이 아니라 피연산자가 변수라면, 연산은 컴파일 때 일어나는게 아니라
		 * 실행 시 이루어진다.
		 * 정수타입 변수가 산술 연산식에서 피연산자로 사용되면
		 * int 타입보다 작은 byte, short 타입의 변수는 int 타입으로 자동타입 변환되어
		 * 연산하게 된다.
		 * 따라서 아래 코드는 컴파일 에러가 난다.
		 */
		byte x = 10;
		byte y = 20;
//		byte result2 = x + y; // compile error. 피연산자는 int 로 자동변환되어 연산된다
		int result2 = x + y; // 이건 가능
		
		// x,y 가 int 로 인식된다는 것이 핵심
		
		/**
		 * 모든 정수 연산식에서 모든 변수가 int 로 변환되는 것이 아님.
		 * int 타입보다 허용 범위가 더 큰 long 타입이 피연산자로 사용되면
		 * 다른 피연산자는 long 타입으로 변환되어 연산을 수행한다.
		 * 따라서 연산결과는 long 타입 변수에 저장해야 된다.
		 */
		long x2 = 1341241241l;
		long y2 = 1241241231l;
		long result3 = x2 + y2;
		
		System.out.println( result3 );
		
		/**
		 * 실수 연산
		 *
		 * 피연산자가 동일한 실수 타입이면 해당 타입으로 연산된다.
		 * float = float + float
		 *
		 * 피연산자 중 하나가 double 이라면 다른 피연산자도 double 타입으로 변환되어 연산되고
		 * 연산결과 또한 double 이 된다.
		 *            double result = float 1.2f + double 3.4;
		 * casting => double result = double 1.2 + double 3.4;
		 *
		 * int 와 double 을 연산해도 int 가 double 로 변환되어 계산된다.
		 */
		int int1 = 30;
		double d1 = 10.5;
		double d2 = int1 + d1;
		System.out.println( d2 );
		
		/**
		 * 나누기 문제
		 *
		 * 수학에서 1 을 2 로 나누면 0.5 이다.
		 * 하지만 코드로 하면 이게 안됨
		 */
		int num1 = 1;
		int num2 = 2;
		double val1 = num1 / num2;
		System.out.println( val1 ); // 0.0 이 나온다.
		
		// 왜냐면 자바에서 정수 연산의 결과는 항상 정수이기 때문이다.
		// 매우 자주 나오는 실수 중에 하나로, 이걸 제대로 연산하려면
		// 피연산자인 num1, num2 둘 중 하나 또는 둘 모두를 double 타입으로 변환해야 한다.
		double d3 = 1.0;
		double d4 = 2.0;
		double val2 = d3 / d4;
		System.out.println( val2 );
		
		/**
		 * 문자열 자동 캐스팅
		 *
		 * 자바에서 + 연산자를 통해 연산할 때,
		 * 피연산자가 모두 숫자라면 덧셈 기능을 하고,
		 * 피연산자 중 하나가 문자열이라면 다른 피연산자도 문자열로 자동변환되어
		 * '문자열 결합 연산' 이 이루어진다.
		 */
		String str1 = "3";
		int num3 = 7;
		
		System.out.println( str1 + num3 );
		
		// 피연산자 중 하나가 문자열이므로 3 과 7 을 덧셈하는게 아니라 문자열 결합을 한다.
		// "37"
	}
	
	
}
