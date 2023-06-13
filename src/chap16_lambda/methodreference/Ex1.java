package chap16_lambda.methodreference;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		Person person = new Person();
		
		// 파라미터 타입 생략, 
		person.action( ( x, y ) -> Computer.staticGetSum(x, y) );
		
		person.action( Computer::staticGetSum );
		
		Computer computer = new Computer();
		
		person.action( computer::instanceGetSum );
	
	}

}
