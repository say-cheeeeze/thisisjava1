package chap08.interface2;

public class SmartTVExample {
	public static void main( String[] args ) {
		
		SmartTV smartTV = new SmartTV();
		smartTV.searchURL( "test" );
		smartTV.turnOn();
		smartTV.turnOff();
		
		HttpProtocol httpProtocol = new SmartTV();
		httpProtocol.searchURL( "https://www.naver.com" );
		
		RemoteControl remoteControl = new SmartTV();
		remoteControl.turnOff();
		remoteControl.turnOn();
	}
}
