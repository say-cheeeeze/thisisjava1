package chap08.polymorphism;

public class CarExample {
	public static void main( String[] args ) {
		
		Car car = new Car();
		car.run();
		System.out.println( "#########교체##########");
		car.kumhoTire = new KumhoTire();
		car.hanKookTire = new KumhoTire();
		
		car.run();
		
	}
}
