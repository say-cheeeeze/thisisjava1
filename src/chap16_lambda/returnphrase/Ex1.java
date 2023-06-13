package chap16_lambda.returnphrase;

/**
 * 반환값이 있는 람다식예제
 * @author cheeeeze
 *
 */
public class Ex1 {

	public static void main( String[] args ) {
		
		System.out.println( "######################" );
		System.out.println( "action 메소드는 인터페이스 호출만을 위해. " );
		System.out.println( "나머지 작업은 람다 안에서 하는 구조." );
		System.out.println( "######################" );
		
		// 람다가 더하기를 하는 구조.
		action( ( x, y ) -> { 
			return x + y;
		} );
		
		// 람다가 곱셈을 하는 구조.
		action( ( x, y ) -> {
			return x * y;
		});
		
		// 람다가 빼기를 하는 구조.
		action( new Calculable() {
			
			@Override
			public double calc(double x, double y) {
				return x-y;
			}
		});
	}
	
	public static void action( Calculable calculable ) {
		double result = calculable.calc( 10.5, 0.5 );
		System.out.println( result );
	}
}
