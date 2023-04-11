package chap01.variabletype;

public class Char01 {
	
	public static void main( String[] args ) {
		
		/**
		 * 문자 리터럴은 ' ' 로 감싼 하나의 문자를 뜻하며
		 * 문자 리터럴은 유니코드로 변환되어 저장된다.
		 *
		 * 유니코드는 세계 각국의 문자를 0 ~ 65536 숫자로 매핑한 국제 표준규약이다.
		 * java 에서는 유니코드를 char 타입으로 저장할 수 있다.
		 */
		char var1 = 'A';
		System.out.println( var1 );
		
		char var3 = '가';
		System.out.println( var3 );
		
		
		/**
		 * 유니코드가 정수이기 때문에 char 타입도 정수이다.
		 * 그래서 char 변수에 작은 따옴표가 아니라 숫자를 직접 할당할 수도 있다.
		 */
		
		// 65 가 알파벳 대문자 'A' 이다.
		char var2 = 65;
		System.out.println( var2 );
		
		// 16진수로 'A' 나타내기
		char var4 = 0x0041; // 몇진수로 하든 65 를 저장하면 A 가 되니까.
		System.out.println( var4 );
		
		// 8진수로 'A' 나타내기
		char var5 = 011; // 몇진수로 하든 65 를 저장하면 A 가 되니까.
		System.out.println( var5 );
		
		
		
		
		/**
		 * char 타입 변수에 어떤 문자로 할당하지 않고 초기화하려면
		 * '' 을 대입하면 컴파일 에러가 발생한다.
		 * 이 때 유니코드 32 인 공백 하나로 대입해서 초기화해야한다.
 		 */
		// char var6 = ''; //Empty character literal
		char var7 = ' ';
		char var8 = 32;
		System.out.println( var7 );
		System.out.println( var8 );
		System.out.println( var7 == var8 ); // true
	}
}
