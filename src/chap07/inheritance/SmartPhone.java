package chap07.inheritance;

public class SmartPhone extends Phone {
	
	public boolean wifi;
	
	public SmartPhone( String model, String color ) {
		this.model = model;
		this.color = color;
	}
	
	public void setWifi( boolean wifi ) {
		this.wifi = wifi;
	}
	
	public void connect() {
		System.out.println( "인터넷에 연결합니다." );
	}
}
