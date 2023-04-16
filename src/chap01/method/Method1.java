package chap01.method;

public class Method1 {
	
	public static void main( String[] args ) {
		
		
		int sumVal = sum( 5, 5, 5, 10 );
		
		System.out.println( sumVal );
	}
	
	/**
	 * 가변길이 매개변수
	 */
	public static int sum( int ... values ) {
		int sum = 0;
		
		for( int i = 0; i < values.length; i++ ) {
			sum += values[i];
		}
		
		return sum;
	}
}
