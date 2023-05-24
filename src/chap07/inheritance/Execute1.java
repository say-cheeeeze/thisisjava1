package chap07.inheritance;

/**
 * 상속 클래스 테스트
 */
public class Execute1 {
	
	public static void main( String[] args ) {
	
		SmartPhone smartPhone = new SmartPhone( "iPhone", "White" );
		
		System.out.println( "모델 : " + smartPhone.model );
		System.out.println( "색상 : " + smartPhone.color );
		
		System.out.println( "wifi : " +  smartPhone.wifi );
		
	}
}
