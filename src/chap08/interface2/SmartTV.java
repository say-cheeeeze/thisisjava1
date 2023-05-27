package chap08.interface2;

public class SmartTV implements HttpProtocol, RemoteControl {
	
	@Override public void searchURL( String url ) {
		System.out.println( url + "을 검색합니다." );
	}
	
	@Override public void turnOn() {
		System.out.println( "전원을 켭니다" );
	}
	
	@Override public void turnOff() {
		System.out.println( "전원을 끕니다." );
	}
}
