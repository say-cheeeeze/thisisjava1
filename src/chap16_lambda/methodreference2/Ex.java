package chap16_lambda.methodreference2;

public class Ex {

	public static void main( String[] args ) {
		
		Person person = new Person();
		
		person.ordering( ( a, b ) -> a.compareToIgnoreCase( b ) );
		person.ordering( String::compareToIgnoreCase);
	}
}
