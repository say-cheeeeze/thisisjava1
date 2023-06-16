package chap18_io.inputoutputstream.ex1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex1 {

	public static void main( String[] args ) {
		
		try {
			
			String targetFile = "/Users/cheeeeze/git/eclipseworkspace202306/thisisjava1/src/chap18_io/inputoutputstream/ex1/output/test1.db";
			
			OutputStream outputStream = new FileOutputStream( targetFile );
			
			byte a = 97;
			byte b = 98;
			byte c = 99;
			
			outputStream.write( a );
			outputStream.write( b );
			outputStream.write( c );
			
			outputStream.flush();
			
			outputStream.close();
			
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
