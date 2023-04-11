package chap01.variabletype;

public class FloatDouble {
	
	public static void main( String[] args ) {
		
		/**
		 * 실수형 float 와 double
		 *
		 * 메모리크기
		 * float : 4byte, 32bit
		 * double : 8byte, 64bit
		 *
		 * 유효 소수 이하 자리
		 * float : 7자리
		 * double : 15자리
		 *
		 * double 타입이 float 타입보다 큰 실수를 저장할 수 있고 정밀도 또한 높다.
		 * 약 2배 정도 유효자릿수를 가지기 때문에 2배 정도 정밀도를 갖는다.
		 * 그래서 이름이 double 임
		 *
		 * 자바는 IEEE754 표준에 근거하여 float 와 double 타입의 변수를
		 * 부동소수점 (floating-point) 방식으로 메모리에 저장한다.
		 * 			부호  +  가수    +    지수
		 * 			+       m      x   10의 n
		 *
		 * float 는 32bit 를 이렇게 나눈다
		 * 부호(1bit) + 지수(8bit) + 가수(23bit)
		 *
		 * double 은 64bit 를 이렇게 나눈다
		 * 부호(1bit) + 지수(11bit) + 가수(52bit)
		 */
		double x1 = 0.25;
		double x2 = -3.14;
		
		System.out.println( x1 );
		System.out.println( x2 );
		
		/**
		 * 컴파일러는 실수 리터럴을 기본적으로 double 로 인식한다.
		 * float 타입으로 대입하고 싶으면 리터럴 뒤에 f 또는 F 를 붙여서 컴파일러에게 float 라고 알랴줘야함
		 */
		float x3 = 0.25F;
		float x4 = -3.14f;
		System.out.println( x3 );
		System.out.println( x4 );
		
		/**
		 * e 또는 E 가 포함된 10의 거듭제곱 리터럴
		 */
		float x5 = 5e2F; // 5.0 x 10의2승 = 500.0 이 됨
		System.out.println( x5 );
		
		float x6 = 16.301e-2f; // 16.301 x 10의 -2 승 = 0.16301
		System.out.println( x6 );
		
		/**
		 * 정밀도 비교
		 */
		System.out.println( "############# 정밀도 비교 ###########" );
		float acc1  = 0.1234567890123456789f;
		double acc2 = 0.1234567890123456789;
		
		System.out.println( acc1 ); // 0.12345679
		System.out.println( acc2 ); // 0.12345678901234568
		
		
	}
}
