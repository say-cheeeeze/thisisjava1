package chap18_io.inputoutputstream.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 파일 복사의 에제
 * @author cheeeeze
 *
 */
public class FileCopy1 {
	
	public static void main( String[] args ) throws IOException {
		
		String originFile = "K:/eclipseworkspace/thisisjava1/src/chap18_io/inputoutputstream/ex1/img/origin/img1.png";
		String pasteFile = "K:/eclipseworkspace/thisisjava1/src/chap18_io/inputoutputstream/ex1/img/origin/img1_copy.png";
		
		File file = new File( originFile );
		
		System.out.println( file.exists() );
		System.out.println( file.length() + "byte" );
		
		InputStream is = new FileInputStream( originFile );
		OutputStream os = new FileOutputStream( pasteFile );
		
		// 원본 파일의 byte 모두를 읽고,
		// 복사할 곳에 write() 한다.
		byte[] data = new byte[1024];
		
		while( true ) {
			
			int num = is.read( data );
			System.out.println( "읽은 바이트 수 : " + num );
			
			if ( num == -1 ) {
				break;
			}
			
			// 출력 스트림에 출력하는데, 매개값 배열[0]부터 num개의 바이트를.
			os.write( data, 0, num );
		}
		
		os.flush();
		os.close();
		is.close();
	}

}
