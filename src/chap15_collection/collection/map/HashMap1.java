package chap15_collection.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {

	public static void main( String[] args ) {
		
		Map map1 = new HashMap<>();
		
		Map<String, Integer> map2 = new HashMap<>();
		
		map2.put( "남윤재", 35 );
		map2.put( "강두민", 34 );
		map2.put( "양현주", 34 );
		map2.put( "한승관", 34 );
		
		System.out.println( "size : " + map2.size() );
		
		String key = "남윤재";
		int value1 = map2.get( key );
		System.out.println( "key 로 value 얻기 : " + value1 );
		
		
		// keySet 얻기
		Set<String> keySet = map2.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while( keyIterator.hasNext() ) {
			
			String innerKey = keyIterator.next();
			int age = map2.get( innerKey );
			
			System.out.println( "이름 : " + innerKey + " / 나이 : " + age );
		}
		
		// 전체 EntrySet 을 얻기
		Set<Entry<String, Integer>> entrySet = map2.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while( entryIterator.hasNext() ) {
			Entry<String, Integer> eachEntry = entryIterator.next();
			String keyName = eachEntry.getKey();
			int valueName = eachEntry.getValue();
			System.out.println( keyName + " / " + valueName );
		}
		
		int removeValue = map2.remove( "한승관" );
		System.out.println( removeValue );
		
	}
}
