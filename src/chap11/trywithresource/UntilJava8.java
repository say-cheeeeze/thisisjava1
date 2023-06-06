package chap11.trywithresource;

import java.io.FileInputStream;

public class UntilJava8 {
	public static void main( String[] args ) {
	
		try (
			FileInputStream fis1 = new FileInputStream( "src/chap11/trywithresource/file1.txt" );
			FileInputStream fis2 = new FileInputStream( "src/chap11/trywithresource/file1.txt" );
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
