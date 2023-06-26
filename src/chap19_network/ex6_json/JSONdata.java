package chap19_network.ex6_json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JSONdata {
	
	public static void main( String[] args ) throws IOException {
		
//		JSON생성자();
		
//		writeJsonFile();
		
		readJsonFile();
	}
	
	public static void JSON생성자() {

		// JSON Object 여러가지 생성자.
		JSONObject json1 = new JSONObject( "{ \"a\" : 1, b:2 }" );
		System.out.println( json1 ); // {"a":1,"b":2}
		
		Map<String, Integer> map = new HashMap<>();
		map.put( "test", 5 );
		JSONObject json2 = new JSONObject( map );
		System.out.println( json2 ); // {"test":5}
	}
	
	public static void writeJsonFile() throws IOException {
		
		// 기본 생성자
		JSONObject json3 = new JSONObject();
		System.out.println( json3 ); // {}
		
		json3.put( "userId", "yoonjae" );
		json3.put( "userAge", 35 );
		json3.put( "hobby", Arrays.asList( "물마시기", "숨쉬기", "운동하기" ) );
		json3.put( "isHandsome", true );
		
		System.out.println( json3 );
		String strJson = json3.toString();
		System.out.println( strJson );
		
		// 파일로 저장
		
		String here = System.getProperty( "user.dir" ) + "/src/chap19_network/ex6_json/json1.txt";
		Writer writer = new FileWriter( here, Charset.defaultCharset() );
		writer.write( strJson );
		writer.flush();
		writer.close();
	}
	
	
	public static void readJsonFile() throws IOException {

		String jsonFile = System.getProperty( "user.dir" ) + "/src/chap19_network/ex6_json/json1.txt";
		BufferedReader reader = new BufferedReader( new FileReader( jsonFile, Charset.defaultCharset() ) );
		String line = reader.readLine();
		
		System.out.println( line );
		reader.close();
		
		JSONObject json = new JSONObject( line );
		System.out.println( "json :>::::::: " + json );
		
		
	}
	

}
