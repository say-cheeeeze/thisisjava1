package chap18_io.inputoutputstream.ex2_char;

import java.io.FileReader;
import java.io.Reader;

/**
 * 문자 읽기 Reader 추상클래스를 상속받은 클래스
 * InputStreamReader
 * FileReader
 * BufferedReader
 * 
 * @author cheeeeze
 *
 */
public class ReaderEx1 {

	static final String textFile = "/Users/cheeeeze/git/eclipseworkspace202306/thisisjava1/src/chap18_io/inputoutputstream/ex2_char/txt1.txt";
	
	public static void main( String[] args ) {
		
	
//		한개씩읽기();
		
		배열로읽기();
		
		
	}
	
	
	
	/**
	 * 한 개씩 읽기. read() 메소드를 여러번 반복하여 1개의 문자를 읽기를 반복한다.
	 */
	public static void 한개씩읽기() {
		
		try {
			
			Reader reader = new FileReader( textFile );
			
			while( true ) {
				
				// 1개의 문자를 읽고 반환
				int character = reader.read();
				
				if ( character == -1 ) { 
					break;
				}
				
				// 읽은 데이터를 문자로 변환한다.
				System.out.print( (char) character );
			}

			
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 파일을 읽어 저장할 배열이 필요하다.
	 */
	public static void 배열로읽기() {
		
		try {
			
			Reader reader = new FileReader( textFile );
			
			// 읽은 문자를 저장할 배열
			char[] data = new char[100];
			
			while( true ) {
				
				// 파일 스트림을 읽는데 배열에 저장하고 읽은 문자 수를 반환한다.
				int character = reader.read( data );
				
				if ( character == -1 ) {
					break;
				}
				
				for( int i= 0; i < character; i++ ) {
					System.out.print( data[i] );
				}
			}

			System.out.println( "종료.." );
			
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
