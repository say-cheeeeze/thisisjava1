package chap15_collection.collection.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * 검색기능이 강화된 Set
 * @author cheeeeze
 *
 */

public class TreeSet1 {

	public static void main( String[] args ) {
		
		TreeSet<Integer> scoreSet = new TreeSet<>();
		scoreSet.add( 80 );
		scoreSet.add( 75 );
		scoreSet.add( 67 );
		scoreSet.add( 90 );
		scoreSet.add( 83 );
		
		System.out.println( scoreSet.size() );
		
		// 정렬된 Integer 하나씩 꺼내오기
		for( Integer score : scoreSet ) {
			System.out.print( score + " ");
		}
		System.out.println();
		
		// 제일 낮은 객체 반환
		int scoreFirst = scoreSet.first();
		System.out.println( "scoreFirst : " + scoreFirst );
		
		// 제일 높은 객체 반환
		int scoreHighest = scoreSet.last();
		System.out.println( "scoreHighest : " + scoreHighest );
		
		System.out.println( "80바로 아래의 값 ? : " + scoreSet.lower( 80 ) );
		
		// 내림차순 정렬
		NavigableSet<Integer> descendingSet = scoreSet.descendingSet();
		System.out.println( "내림차순 정렬" );
		for( Integer score : descendingSet ) {
			System.out.print( score + " ");
		}
		
		// 범위검색 75보다 큰 것 tailSet 을 이용
		NavigableSet<Integer> over75Set = scoreSet.tailSet( 75, false );
		for( Integer score : over75Set ) {
			System.out.println( score + " " );
		}
	}
}
