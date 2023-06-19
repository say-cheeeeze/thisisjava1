package chap18_io.inputoutputstream.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex1 {

	public static void main( String[] args ) {
		
		String fileSeparator = System.getProperty( "file.separator" );
		StringBuilder sb = new StringBuilder();
		sb.append( "src" ).append( fileSeparator )
			.append( "chap18_io" ).append( fileSeparator )
			.append("inputoutputstream" ).append( fileSeparator )
			.append("ex1" ).append( fileSeparator )
			.append("output" ).append( fileSeparator )
			.append("test1.db" );
		
		 // test1(  sb  );
		 
		 test2( sb );
	}
	
	public static void test2( StringBuilder sb ) {

		try {
			InputStream is = new FileInputStream( sb.toString() );
			
			// 파일을 읽고 최대 100 바이트를 저장하겠다.
			byte[] data = new byte[100];
			
			while( true ) {
				
				int readVal = is.read( data );
				
				if ( readVal == - 1 ) {
					break;
				}
				for( int i = 0; i < data.length; i++ ) {
					
					System.out.println( data[i] );
				}
			}
			
			is.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void test1( StringBuilder sb ) {

		try {
			
			OutputStream outputStream = new FileOutputStream( sb.toString() );
			
			byte a = 97;
			byte b = 98;
			byte c = 99;
			
			// 1바이트씩 출력
			outputStream.write( a );
			outputStream.write( b );
			outputStream.write( c );
			
			String str1 = "안녕하세요";
			byte[] byteArr = str1.getBytes();
			
			// 매개값 byte배열 모두 출력
			outputStream.write(byteArr);
			
			outputStream.write( '\n' );
			outputStream.write(byteArr, 0, 6);
			
			for( int i = 0; i < byteArr.length; i++ ) {
				System.out.println( byteArr[i] );
			}
			
			
			// 출력 버퍼에 잔류하는 모든 바이트 출력
			outputStream.flush();
			
			// 출력 스트림 닫고 메모리 해제
			outputStream.close();
			
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
	}
	
}
