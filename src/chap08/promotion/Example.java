package chap08.promotion;

public class Example {
	public static void main( String[] args ) {
		
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		ClassD d = new ClassD();
		ClassE e = new ClassE();
		
		InterfaceA a;
		a = b;
		System.out.println( a instanceof ClassB );
		
		a = c;
		System.out.println( a instanceof ClassC );
		
		a = d;
		System.out.println( a instanceof ClassB );
		
		a = e;
		System.out.println( a instanceof ClassC );
		
	}
}
