package chap07.typecasting;

public class Execute {
	
	public static void main( String[] args ) {
	
		Cat cat = new Cat();
		Animal animal = cat;
		
		System.out.println( cat == animal );
	}
}
