package chap18_io.inputoutputstream.ex2_char;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx1 {

	public static void main( String[] args ) {
		
		try {
			
			String newFileName = "K:\\eclipseworkspace\\thisisjava1\\src\\chap18_io\\inputoutputstream\\ex2_char\\newFile.txt";
			Writer writer = new FileWriter( newFileName );
		
			char a = 'A';
			writer.write( a );
			writer.write(  '\n' );
			
			String word1 = "한 줄을 다 읽어서 써줭";
			writer.write( word1 );
			writer.write(  '\n' );
			
			char[] charArr = word1.toCharArray();
			writer.write( charArr );
			writer.write(  '\n' );
			
			writer.flush();
			writer.close();
		
		}
		catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
