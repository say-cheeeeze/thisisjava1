package chap07.inheritance;

public class Phone {
	
	public String model;
	public String color;
	
	public void bell() {
		System.out.println( "벨이 울립니다" );
	}
	
	public void sendVoice( String message ) {
		System.out.println( "자신 : " + message );
	}
	
	public void receiveMessage( String message ) {
		System.out.println( "상대방 : " + message );
	}
	
	public void hangUp() {
		System.out.println( "통화를 종료합니다.." );
	}
	
	protected void test1() {
		System.out.println( "protected 메서드" );
	}
}
