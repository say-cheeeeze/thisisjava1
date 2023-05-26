package chap07.inheritance;

public class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone( String model, String color ) {
		super( model, color );
		System.out.println( "SmartPhone 생성자...");
	}
	
	public void setWifi( boolean wifi ) {
		if( wifi ) {
			System.out.println( "wifi에 연결합니다...");
		}
		else {
			System.out.println( "wifi 연결을 해제합니다...");
		}
		this.wifi = wifi;
	}
	
	public void connect() {
		System.out.println( "인터넷에 연결합니다." );
	}
	
	@Override
	public void hangUp() {
		System.out.println( "스마트폰의 통화를 종료합니다...(Overriding)");
	}
	
}
