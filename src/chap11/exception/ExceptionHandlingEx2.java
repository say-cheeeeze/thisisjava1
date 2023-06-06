package chap11.exception;

public class ExceptionHandlingEx2 {
	
	public static void main( String[] args ) {
	
		try {
			Class<?> s = Class.forName( "java.lang.String" );
			System.out.println( s );
			System.out.println( "java.lang.String 클래스가 존재합니다." );
			
			System.out.println();
			
			Class.forName( "java.lang.yoonjae" );
			System.out.println( "yoonjae 클래스도 있냐?" );
		}
		catch( ClassNotFoundException e ) {
			e.printStackTrace();
		}
		finally {
			System.out.println( "finally........" );
		}
		
	}
}
