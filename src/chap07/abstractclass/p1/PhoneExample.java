package chap07.abstractclass.p1;

public class PhoneExample {
	
	public static void main( String[] args ) {
		
		// Phone phone = new Phone(); // X 추상클래스는 객체를 생성할 수 없다.
		
		SmartPhone smartPhone = new SmartPhone( "남윤재" );
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
