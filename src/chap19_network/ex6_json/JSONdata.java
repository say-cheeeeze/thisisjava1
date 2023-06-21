package chap19_network.ex6_json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class JSONdata {
	
	public static void main( String[] args ) {
		
		JSONObject json1 = new JSONObject( "{ \"a\" : 1, b:2 }" );
		System.out.println( json1 ); // {"a":1,"b":2}
		
		Map<String, Integer> map = new HashMap<>();
		map.put( "test", 5 );
		JSONObject json2 = new JSONObject( map );
		System.out.println( json2 ); // {"test":5}
		
		
	}

}
