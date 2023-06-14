package chap17_stream.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 스트림은 오리지널스트림 -> 필터링 중간 스트림 -> 매핑 중간 스트림 -> 집계 최종 처리를 거친다.
 * @author cheeeeze
 *
 */
public class Ex2 {
	
	public static void main( String[] args ) {
		
//		solution1();
		
		methodChaning();
	}
	
	public static void methodChaning() {

		List<Integer> list = new ArrayList<>();
		list.add( 0 );
		list.add( 1 );
		list.add( 5 );
		list.add( 3 );
		list.add( 10 );
		list.add( 58 );
		
		double avg = list.stream().mapToInt( value -> value ).average().getAsDouble();
		avg = Math.round( 100 * avg );
		avg = avg / 100;
		
		System.out.println( "평균 소수점 두자리수까지 : " + avg );
	}
	
	public static void solution1() {

		
		List<Integer> list = new ArrayList<>();
		list.add( 0 );
		list.add( 1 );
		list.add( 5 );
		list.add( 3 );
		list.add( 10 );
		list.add( 58 );
		
		Stream<Integer> stream1 = list.stream();
		
		// 평균 얻는 과정
		IntStream avgStream = stream1.mapToInt(value -> value);
		
		double avg = avgStream.average().getAsDouble();
		
		avg = Math.round( avg * 100 );
		avg = avg / 100;
		
		System.out.println( "평균 소수점 두자리수까지 : " + avg );
	}

}
