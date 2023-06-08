package chap12.javabase.wrapper;

public class WrapperClass1 {
	
	public static void main( String[] args ) {
		
		Integer int1 = 300;
		Integer int2 = 300;
		
		// == 는 내부의 값을 비교하지않고 포장된 객체의 주소. 메모리 주소를 비교하기 때문에
		// equals() 로 비교해야 된다.
		System.out.printf( "%-14s : %s\n", "== 비교" , ( int1 == int2 ) ); // X
		System.out.printf( "%-14s : %s\n", "equals() 비교" , int1.equals( int2 ) ); // X
		
	}
}
