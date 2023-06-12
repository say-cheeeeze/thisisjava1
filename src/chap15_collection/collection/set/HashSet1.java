package chap15_collection.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {
	
	public static void main( String[] args ) {
		
		// test1();
		
		Set<Member> memberSet = new HashSet<>();

		Member member1 = new Member( "홍길동", 21 ); 
		Member member2 = new Member( "이병헌", 40 );
		Member member3 = new Member( "홍길동", 21 ); 
	
//		System.out.println( member1.hashCode() );
//		System.out.println( member2.hashCode() );
//		System.out.println( member3.hashCode() );
		memberSet.add( member1 );
		memberSet.add( member2 );
		memberSet.add( member3 );
		
		System.out.println( "몇개임 : " + memberSet.size() );
		
		Iterator<Member> iterator = memberSet.iterator();
		while( iterator.hasNext() ) {
			System.out.println( iterator.next().getName() );
		}
		
	}
	
	public static void test1() {

		
		Set<String> set = new HashSet<>();
		set.add( "String" );
		set.add( "Integer" );
		
		int size = set.size();
		System.out.println( "size : " + size );
		
		boolean removeResult = set.remove( "tring" );
		System.out.println( "삭제 결과 : " + removeResult );
		size = set.size();
		System.out.println( "삭제 후 size : " + size );
		
		boolean isEmpty = set.isEmpty();
		boolean isContains = set.contains( "String" );
		Iterator<String> iterator = set.iterator();
		while( iterator.hasNext() ) {
			
			// Returns the next element in the iteration.
			System.out.println( "set 의 내용 순회 : " + iterator.next() );
		}
	}

}
