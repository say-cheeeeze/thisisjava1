package chap11.exception;

public class ExceptionHandlingEx1 {
	
	private static int printLength( String param ) {
		
		int result = 0;
		try {
			result = param.length();
			System.out.println( "문자 수 : " + result );
		}
		catch( NullPointerException e ) {
			System.out.println( "####### ERROR 발생 ! ######" );
			String message = e.getMessage();
			System.out.println( "Throwable.getMessage : " + message );
			
			String toString = e.toString();
			System.out.println( "toString : " + toString );
			
			e.printStackTrace();
		}
		finally {
			System.out.println( "catch or 메서드 return 을 해도 여기는 무조건 타요" );
		}
		System.out.println( "return:" );
		return result;
	}
	
	public static void main( String[] args ) {
	
		printLength( "ThisisJava" );
		printLength( null );
	}
}
