package chap07.polymorphism;

public class CarExample {
	
	public static void main( String[] args ) {
		
		Car myCar = new Car();
		myCar.tire = new Tire();
		myCar.run();
		
		myCar.tire = new HankookTire();
		myCar.run();
		
		myCar.tire = new KumhoTire();
		myCar.run();
		
		HankookTire hankookTire = new HankookTire();
		myCar.drive( hankookTire );
		
	}
}
