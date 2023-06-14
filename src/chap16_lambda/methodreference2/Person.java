package chap16_lambda.methodreference2;

public class Person {

	/**
	 * 순서를 지정함..
	 * @param comparable
	 */
	public void ordering( Comparable comparable ) {
		String a = "홍길동";
		String b = "김길동";
		
		int result = comparable.compare(a, b);
		
		if ( result < 0 ) {
			System.out.println( a + " 는 " + b + "보다 앞에 옵니다" );
		}
		else if ( result == 0 ) {
			System.out.println( a + "는 " + b + "와 같습니다" );
		}
		else {
			System.out.println( a + "가 " + b + "보다 뒤에 옵니다" );
		}
	}
}
