package chap01.method;

/**
 * 메소드 오버로딩
 * 메소드 리턴 타입은 무관
 * 메소드 이름은 같도록
 * 매개변수 타입과 개수, 순서가 다른 것을 여러개 선언함
 */

public class MethodOverloading {
	
	public static void main( String[] args ) {
		
		Calculator calculator = new Calculator();
		double area1 = calculator.areaRectangle( 10 );
		System.out.println( area1 );
		
		double area2 = calculator.areaRectangle( 10*20 );
		System.out.println( area2 );
	}
}
