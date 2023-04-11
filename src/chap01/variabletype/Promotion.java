package chap01.variabletype;

public class Promotion {
	
	public static void main( String[] args ) {
		
		/**
		 * 자동타입 변환 Promotion
		 * 자동으로 타입변환이 일어나는 것
		 *
		 * 자동타입변환은 값의 허용범위가 작은 것에서 큰 타입으로 대입될 때 발생한다.
		 *
		 * byte < short,char < int < long < float < double
		 *
		 * 허용범위가 더 큰 것이면 자동 타입 변환이 된다.
		 */
		byte byteValue1 = 127;
		int intValue1 = byteValue1; // 자동타입변환
		
		/**
		 * 정수타입이 실수로 대입될 때는 무조건 자동타입변환이 된다.
		 */
		long longValue1 = 5000000000000L;
		float float1 = longValue1;
		double double1 = longValue1;
		
		System.out.println( float1 ); // 4.9999999E12
		System.out.println( double1 ); // 5.0E12 (더 정확하쥬?)
		
		
		
		/**
		 * char 타입의 경우 int 타입으로 자동 변환되면 유니코드 값이 int 타입에 대입된다.
		 */
		char char1 = 'A';
		int int1 = char1;
		System.out.println( int1 ); // 65
		
		/**
		 * 예외가 있는데 char 는 byte 보다 허용범위가 작은데,
		 * byte 는 음수가 있지만 char 는 음수를 허용하지 않기 때문에 자동변환될 수 없다.
		 */
		byte byte1 = 10;
		// char char2 = byte1; // byte 는 char 로 안됨!
		
		
	}
}
