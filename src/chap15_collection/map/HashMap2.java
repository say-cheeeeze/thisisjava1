package chap15_collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap2 {
	
	public static void main( String[] args ) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put( "blue", 96 );
		map.put( "hong", 86 );
		map.put( "white", 92 );
		
		String name = null; // 최고점수 받은 아이디
		int maxScore = 0; // 최고점수
		int totalScore = 0; // 점수 합계
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while( iterator.hasNext() ) {
			Entry<String, Integer> item = iterator.next();
			int value = item.getValue();
			if ( maxScore < value ) {
				maxScore = value;
				name = item.getKey();
			}
			totalScore += value;
		}
		
		System.out.println( "최고점수 받은 아이디 : " + name );
		System.out.println( "최고점수 : " +maxScore );
		System.out.println( "점수 합게 : " + totalScore );
		
	}

}
