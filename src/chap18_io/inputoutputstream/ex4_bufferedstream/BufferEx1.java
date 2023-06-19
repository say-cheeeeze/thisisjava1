package chap18_io.inputoutputstream.ex4_bufferedstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 성능 향상 스트림
 * 
 * @author cheeeeze
 *
 */
public class BufferEx1 {

	public static void main( String[] args ) throws Exception {
		
		String originFilePath = BufferEx1.class.getResource( "img1.png" ).getPath();
		
//		System.out.println( "originFilePath : " + originFilePath );
		
		String distPath = "/Users/cheeeeze/git/eclipseworkspace202306/thisisjava1/src/chap18_io/inputoutputstream/ex4_bufferedstream/";
		
		// 버퍼를 사용하지 않고 복사
		InputStream is = new FileInputStream( originFilePath );
		OutputStream os = new FileOutputStream( distPath + "dist1.png");
		System.out.println( "InputStream TEST 1" );
		copyFile( is, os );
		
		InputStream is2 = new FileInputStream( originFilePath );
		OutputStream os2 = new FileOutputStream( distPath + "dist2.png");
		BufferedInputStream bis = new BufferedInputStream( is2 );
		BufferedOutputStream bos = new BufferedOutputStream( os2 );
		System.out.println( "BufferedInputStream TEST 2" );
		copyFile( bis, bos );
		
	}
	
	public static void copyFile( InputStream is, OutputStream os ) {
		
		long start = System.nanoTime();

		try {
			while( true ) {
				
				int data = is.read();
				
//				System.out.println( "읽은 바이트 수 : " + num );
				
				if ( data == - 1 ) {
					break;
				}
				os.write( data );
			}
			
			os.flush();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long end = System.nanoTime();
		
		System.out.println( "실행 결과 : " +  ( end - start ) / 1000 / 1000 + "ms");
		
	}
}
