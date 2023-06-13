package chap16_lambda.functionalinterface.ex2;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		Person person = new Person( "남윤재", "개발", 8, "안녕하세요" );
		
		person.action1( ( job, dutyTime ) -> {
			System.out.println( job + "을 " + dutyTime + "시간동안 합니다" );
		} );
		
		person.action2( content -> {
			System.out.println( "인사합니다 >> : " + content );
		} );
		
		person.action2( content -> System.out.println( content ) );
	}

}
