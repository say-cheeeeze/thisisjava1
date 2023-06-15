package chap17_stream.ex2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 다양한 리소스로부터 스트림 객체를 얻을 수 있다.
 * @author cheeeeze
 *
 */
public class GetStream {
	
	public static void main( String[] args ) throws Exception {
		
//		getStreamByArrayList();
		
		getStreamByFile();
		
	}
	
	public static void getStreamByFile() throws Exception {
		
		Path path = Paths.get( GetStream.class.getResource( "data.txt" ).toURI() );
		
		/**
		 * Files.lines( Path, Charset ) 을 이용하여 텍스트 파일의 행 단위 데이터를
		 * 스트림 객체로 얻을 수 있다.
		 * Read all lines from a file as a Stream. 
		 * Unlike readAllLines, this method does not read all lines into a List
		 * but instead populates lazily as the stream is consumed.
		 */
		Stream<String> fileStream = Files.lines( path, Charset.forName( "UTF-8" ) );
		
		// 스트림 요소는 한 행의 문자열 데이터임.
		fileStream.forEach( line -> System.out.println( line ) );
		fileStream.close();
	}
	
	public static void getStreamByArrayList() {

		
		List<String> list = new ArrayList<>();
		list.add( "홍길동1" );
		list.add( "홍길동2" );
		list.add( "홍길동3" );
		list.add( "홍길동4" );
		list.add( "홍길동5" );
		
		Stream<String> strStream = list.stream();
		strStream.forEach( item -> System.out.println( item ));
		
		String[] strArr = { "문자열1", "문자열2", "문자열3", "문자열4" };
		Stream<String> strStream2 = Arrays.stream( strArr );
		strStream2.forEach( item -> System.out.println( item ) );
		
		Integer[] intArr = { 1,2,3,4,11 };
		Stream<Integer> intStream = Arrays.stream( intArr );
		intStream.forEach( item -> System.out.println( item ) );
	}

}
