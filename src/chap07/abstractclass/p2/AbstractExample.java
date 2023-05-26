package chap07.abstractclass.p2;

public class AbstractExample {
	
	public static void main( String[] args ) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		animalSound( dog );
		animalSound( cat );
	}
	
	public static void animalSound( Animal animal ) {
		animal.sound();
	}
}
