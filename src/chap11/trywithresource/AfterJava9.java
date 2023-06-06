package chap11.trywithresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AfterJava9 {
	public static void main( String[] args ) throws FileNotFoundException {
		
		FileInputStream fis1 = new FileInputStream( "src/chap11/trywithresource/file1.txt" );
		FileInputStream fis2 = new FileInputStream( "src/chap11/trywithresource/file1.txt" );
		
		try (
			fis1;
			fis2;
		) {
			System.out.println( fis1 );
			System.out.println( fis2 );
			
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
		finally {
		
		}
		
	}
}
