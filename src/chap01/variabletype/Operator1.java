package chap01.variabletype;

/**
 * 연산자
 */
public class Operator1 {
	
	public static void main( String[] args ) {
		
		/**
		 * 나눗셈 연산 NaN 과 Infinity 처리
		 *
		 * 나눗셈(/) 또는 나머지(%) 연산에서 좌측 피연산자가 정수이고
		 * 우측 피연산자가 0 인 경우
		 * ArithmeticException 예외가 발생한다.
		 *
		 * 무한대의 값을 정수로 표현할 수 없기 때문이다.
		 *
		 * 하지만 좌측 피연산자가 실수이거나 우측 피연산자가 0.0 또는 0.0f 이면
		 * 예외가 발생하지 않고 연산 결과가 Infinity (무한대) 또는 NaN (Not a Number) 가 된다.
		 */
		int x = 5;
		int y = 0;
//		int result = x / y;
//		System.out.println( result ); // ArithmeticException : / by zero
		
		System.out.println( 5 / 0.0 ); // Infinity
		
		System.out.println( 5.1f / 0 ); // Infinity
		
		System.out.println( 5 / 0.0f ); // Infinity
		
		System.out.println( 5 % 0.0f ); // NaN
		
		/**
		 * Inifinty 또는 NaN 여부를 확인하기 위해서
		 * Double.isInfinite() 와 Double.isNaN() 을 사용한다.
		 */
		double z = x / y;
		boolean result = Double.isInfinite( z );
		System.out.println( result ); // true
		
		double z2 = 5.0f % 0.0f;
		boolean result2 = Double.isNaN( z2 );
		System.out.println( result2 );
	}
}
