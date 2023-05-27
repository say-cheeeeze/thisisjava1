package chap08.polymorphism;

public class Car {
	
	Tire hanKookTire = new HanKookTire();
	Tire kumhoTire = new KumhoTire();
	
	void run() {
		hanKookTire.roll();
		kumhoTire.roll();
	}
}
