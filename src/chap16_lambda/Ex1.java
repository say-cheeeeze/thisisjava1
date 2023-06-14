package chap16_lambda;

interface AddInterface1 {
	int result( int x );
}

interface VoidInterface {
	void result( int x );
}

interface AddInterface2 {
	int result( int x, int y );
}

interface MultipleInterface {
	int result( int x, int y );
}

interface GetMaxInterface {
	int getMax( int x, int y );
}

public class Ex1 {
	public static void main( String[] args ) {
		
		// 매개변수 한 개 있는 경우.
		AddInterface1 addInterface1 = ( x ) -> { return x; };
		
		// 매개변수가 하나일 경우 괄호를 생략 가능하다.
		addInterface1 = x -> x;
		
		VoidInterface voidInterface = x -> System.out.println( x/5 );
		voidInterface = x -> { System.out.println( x ); };
		voidInterface.result( 10 );
		
		// 매개변수 타입 생략, return 문과 중괄호 함께 사용
		AddInterface2 addInterface2 = ( x, y ) -> { return ( x + y ); };
		
		// return 문이 하나만 있는 경우 중괄호와 return문을 생략가능하다.
		AddInterface2 addInterface3 = ( x, y ) -> x + y;
		
		System.out.println( addInterface2.result( 10, 5 ) ); // 10 + 5
		System.out.println( addInterface3.result( 10, 5 ) ); // 10 + 5
		
		
		MultipleInterface multiple = ( x, y ) -> x * y;
		System.out.println( multiple.result( 10, 5 ) );

		GetMaxInterface maxInterface = ( x, y ) -> Math.max(x, y);
		int maxValue = maxInterface.getMax(10, 5 );
		System.out.println( maxValue );
	}

}
