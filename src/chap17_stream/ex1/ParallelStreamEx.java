package chap17_stream.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 병렬처리 스트림
 * @author cheeeeze
 *
 */
public class ParallelStreamEx {

	public static void main( String[] args ) {
		
		List<String> list = new ArrayList<>();
		list.add( "홍길동1" );
		list.add( "홍길동2" );
		list.add( "홍길동3" );
		list.add( "홍길동4" );
		list.add( "홍길동5" );
		
		Stream<String> stream = list.parallelStream();
		
		// List 컬렉션의 내부 반복자를 이용하여 병렬 처리 스트림을 얻는다.
		// forEach 메소드에서 요소 처리 방식인 람다식으로 처리되는 요소가 무엇이며
		// 어떤 스레드가 처리하고 있는지 출력함.
		stream.forEach( name -> {
			System.out.println( name + " : " + Thread.currentThread().getName() );
		});
		
	}
}
