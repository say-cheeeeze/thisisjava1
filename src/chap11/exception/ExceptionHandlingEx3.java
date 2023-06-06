package chap11.exception;

public class ExceptionHandlingEx3 {
	
	public static void main( String[] args ) {
		
		String answer = solution();
		System.out.println( answer );
	}
	
	private static String solution() {
		
		String[] array = { "100", "1oo", null, "200" };
		
		String answer = "fail";
		
		for( int i = 0; i <= array.length; i++ ) {
			
			try {
				int value = Integer.parseInt( array[i] );
				System.out.println( "array 의 " + i + " index 의 value : " + value );
			}
			catch( ArrayIndexOutOfBoundsException e ) {
				System.out.println( "배열 인덱스가 초과됨" );
				throw new RuntimeException( "배열 인덱스가 초과됨" );
			}
			catch( NullPointerException | NumberFormatException e ) {
				System.out.println( "NullPointer 또는 NumberFormatException" );
				throw new RuntimeException( "NullPointer 또는 NumberFormatException" );
			}
			finally {
				System.out.println( "index : " + i + " throw 이후에도 finally가 실행되는가" );
			}
		}
		System.out.println( "catch 에서 throw Exception 을 하면 프로그램은 종료된다." );
		// 여기로 오지 못한다.
		return answer = "success";
	}
}
