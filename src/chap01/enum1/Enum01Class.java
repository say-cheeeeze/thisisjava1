package chap01.enum1;

/**
 * 열거 타입도 하나의 데이터 타입이므로 변수를 선언해서 사용해야한다.
 * Week 열거타입 생성한 걸 가지고 인스턴스를 만들어보자.
 */
public class Enum01Class {
	
	public static void main( String[] args ) {
		
		// 열거타입, 변수명 선언
		Enum01 week;
		
		/**
		 * 열거 타입 변수에는 열거 상수를 대입할 수 있는데
		 * '열거 타입.열거 상수' 형태로 작성한다.
		 * 열거 상수인 SUNDAY 를 대입하는 코드
		 */
		Enum01 today = Enum01.SUNDAY;
		
		/**
		 * 열거 타입은 참조타입 객체이므로 null 대입 가능하다.
		 */
		Enum01 birthday = null;
		
		/**
		 * 열거 변수의 값이 특정 열거 상수인지 비교할 때에는
		 * == 와 != 연산자를 이용한다.
		 */
		boolean b1 = today == Enum01.SUNDAY; // true
		System.out.println( b1 );
		
		System.out.println( today );
	}
}
