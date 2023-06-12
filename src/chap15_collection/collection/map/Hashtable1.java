package chap15_collection.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashtable1 {
	
	public static void main( String[] args ) {

		Map<String, Integer> map = new Hashtable<>();
//		Map<String, Integer> map = new HashMap<>();
		
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				
				for( int i = 1; i <= 1000; i++ ) {
					map.put( String.valueOf( i ), i );
				}
			}
		};
		
		Thread thread2 = new Thread() {
			@Override
			public void run() {
				
				for( int i = 1001; i <= 2000; i++ ) {
					map.put( String.valueOf( i ), i );
				}
			}
		};
		
		thread1.start();
		thread2.start();
		
		try {
			
			// 메인main 스레드에서 thread1, thread2 의 실행을 기다려준다.
			thread1.join();
			thread2.join();
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		
		System.out.println( "map size : " + map.size() );
	}
}
