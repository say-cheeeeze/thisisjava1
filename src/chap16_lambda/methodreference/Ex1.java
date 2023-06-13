package chap16_lambda.methodreference;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		Person person = new Person();
		
		person.action( ( x, y ) -> Computer.staticGetSum(x, y));
		
		person.action( Computer::staticGetSum );
		
		Computer computer = new Computer();
		
		person.action( computer::instanceGetSum);
	}

}
