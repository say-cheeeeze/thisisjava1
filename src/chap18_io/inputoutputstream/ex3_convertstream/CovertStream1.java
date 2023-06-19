package chap18_io.inputoutputstream.ex3_convertstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class CovertStream1 {

	public static void main( String[] args ) throws Exception {
		
		// UTF-8 문자셋으로 파일에 문자를 저장하고,
		// 저장된 문자를 다시 읽기
		String filePath = writeToFile();
		
		readFile( filePath );
		
	}
	
	public static String writeToFile() throws Exception {
		
		String filePath = "/Users/cheeeeze/git/eclipseworkspace202306/thisisjava1/src/chap18_io/inputoutputstream/ex3_convertstream/text1.txt";
		String word = "문자를 저장합니다.";
		OutputStream os = new FileOutputStream( filePath );
		
		// 문자 출력 스트림인 Writer 를 생성한다.
		Writer writer = new OutputStreamWriter( os, "UTF-8" );
		writer.write( word );
		writer.flush();
		writer.close();
		return filePath;
	}
	
	public static void readFile( String filePath ) throws Exception {
		
		InputStream is = new FileInputStream( filePath );
		
		// 문자 입력 스트림인 Reader 생성
		Reader reader = new InputStreamReader( is );
		
		char[] cbuf = new char[100];

		// InputStreamReader 보조스트림을 이용하여 문자 입력
		int wordCnt = reader.read( cbuf );
		
		reader.close();
		
		String word = new String( cbuf, 0, wordCnt );
		
		System.out.println( "readFile >>>>>>> " + word );
	}
}
