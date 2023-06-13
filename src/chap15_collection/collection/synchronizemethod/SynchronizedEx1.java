package chap15_collection.collection.synchronizemethod;

import java.text.ParsePosition;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedEx1 {
	
	public static void main( String[] args ) {
		
//		동기화되지않은arraylist();
		
//		동기화arraylist();
		
	}
	
	public static void 동기화되지않은arraylist() {

		
		List<Integer> list = new ArrayList<>();
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				
				for( int i = 1; i <= 1000; i++ ) {
					list.add( i );
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				
				for( int i = 1001; i <= 2000; i++ ) {
					list.add( i );
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		System.out.println( "main 스레드 종료...." );
		
		System.out.println( "thread1 의 상태 : " + thread1.getState() );
		System.out.println( "thread2 의 상태 : " + thread2.getState() );
		int cnt = list.size();
		System.out.println( "개수 : " + cnt );
	}
	
	public static void 동기화arraylist() {

//		List<Integer> list = new ArrayList<>();
		List<Integer> list = Collections.synchronizedList( new ArrayList<>() );
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				
				for( int i = 1; i <= 1000; i++ ) {
					list.add( i );
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				
				for( int i = 1001; i <= 2000; i++ ) {
					list.add( i );
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
			
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		System.out.println( "main 스레드 종료...." );
		
		System.out.println( "thread1 의 상태 : " + thread1.getState() );
		System.out.println( "thread2 의 상태 : " + thread2.getState() );
		int cnt = list.size();
		System.out.println( "개수 : " + cnt );
	}

}
