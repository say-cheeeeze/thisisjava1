package chap17_stream.aggr;

import java.util.Arrays;

/**
 * 스트림 집계
 * @author cheeeeze
 *
 */
public class Aggregation1 {
	
	public static void main( String[] args ) {
		
		int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
		
		// 요소 개수
		long cnt = Arrays.stream( arr ).count();
		System.out.println( "cnt : " + cnt );
		
		// 총 합
		int sum = Arrays.stream( arr ).sum();
		System.out.println( "sum : " + sum );
		
		// 평균
		double average = Arrays.stream( arr ).average().getAsDouble();
		System.out.println( "average : " + average );
		
		// 최대값
		int maxValue = Arrays.stream( arr ).max().getAsInt();
		System.out.println( "maxValue : " + maxValue );
		
		// 최소값
		int minValue = Arrays.stream( arr ).min().getAsInt();
		System.out.println( "minValue : " + minValue );
		
		// 첫번쨰 요소
		int firstValue = Arrays.stream( arr ).filter( i -> i % 3 == 0 ).findFirst().getAsInt();
		System.out.println( "firstValue : " + firstValue );
	}

}
