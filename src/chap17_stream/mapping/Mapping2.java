package chap17_stream.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mapping2 {
	
	public static void main( String[] args ) {
		
		int[] intArr = { 1,2,3,4,5 };
		IntStream intStream = Arrays.stream( intArr );
		double[] doubleArr;
		doubleArr = intStream.asDoubleStream().toArray();
		
		System.out.println( Arrays.toString( doubleArr ) );
		
		System.out.println( Arrays.toString( intArr ) );
		
		intStream = Arrays.stream( intArr );
		long[] longArr = intStream.asLongStream().toArray();
		
		System.out.println( Arrays.toString( longArr ) );
		
	}
	

}
