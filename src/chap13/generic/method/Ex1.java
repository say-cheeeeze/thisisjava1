package chap13.generic.method;

public class Ex1 {
	
	/**
	 * 제너릭 메소드
	 *
	 * 타입 파라미터 T 가 활용된다는 것이 반환타입 앞에 선언됨.
	 * @param <T>
	 */
	public static <T> Box<T> boxing( T t ) {
		Box<T> box = new Box<T>();
		box.setT( t );
		return box;
	}
	
	public static void main( String[] args ) {
	
		Box<Integer> box1 = boxing( 100 );
		System.out.println( box1.getT() );
	
		Box<String> box2 = boxing( "사랑합니다" );
		System.out.println( box2.getT() );
		
		System.out.println( compare( 10.5, 20.1 ) );
		
	}
	
	public static <T extends Number> boolean compare( T t1, T t2 ) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return v1 == v2;
	}
}
