package chap07.polymorphism;

public class Car {
	
	public Tire tire;
	
	public void run() {
		tire.roll();
	}
	
	public void drive( Tire tire ) {
		
		if ( tire instanceof HankookTire ) {
			System.out.println( "한국타이어가 파라미터로 왔다." );
			HankookTire hankookTire = ( HankookTire) tire;
			hankookTire.printHankookTire();
		}
		else if ( tire instanceof KumhoTire ) {
			System.out.println( "금호타이어가 파라미터로 왔다." );
			KumhoTire kumhoTire = ( KumhoTire) tire;
			kumhoTire.printKumhoTire();
		}
		
		//tire.drive();
	}
}
