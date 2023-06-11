package chap15_collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector1 {
	
	public static void main( String[] args ) {
		
		// vector 는 동기화된 메소드로 구성되어 있기 때문에
		// 멀티 스레드환경에서 안전하게 객체를 추가 삭제 할 수 있다.
		
		List<Board> boardList = new Vector<>(); // Vector 니까 가능.
//		List<Board> boardList = new	ArrayList<>(); // ArrayList 는 스레드 안전하지 않다.
		
		Thread thread1 = new Thread() {
			
			@Override
			public void run() {
				
				for( int i = 0; i < 1000; i++ ) {
					System.out.println( "thread1 작업중..." + i );
					boardList.add( new Board( "제목" + i, "내용" + i, "글쓴이" +i ) );
				}
			}
		};
		
		Thread thread2 = new Thread() {
			
			@Override
			public void run() {
				
				for( int i = 0; i < 1000; i++ ) {
					System.out.println( "thread2 작업중..." + i );
					boardList.add( new Board( "제목" + i, "내용" + i, "글쓴이" +i ) );
				}
			}
		};
		
		System.out.println( "thread1 의 상태 : " + thread1.getState() );
		System.out.println( "thread2 의 상태 : " + thread2.getState() );
		
		thread1.start();
		System.out.println( "thread1 시작!" );
		
		thread2.start();
		System.out.println( "thread2 시작!" );
		
		System.out.println( "thread1 의 상태 : " + thread1.getState() );
		System.out.println( "thread2 의 상태 : " + thread2.getState() );
		
		try {
			// 각 스레드가 종료될때까지 기다리도록 한다. (main스레드 입장에서)
			thread1.join(); 
			thread2.join();
		}
		catch( InterruptedException e ) {
			
		}
		
		
		System.out.println( "main 스레드 종료...." );
		
		System.out.println( "thread1 의 상태 : " + thread1.getState() );
		System.out.println( "thread2 의 상태 : " + thread2.getState() );
		int listCnt = boardList.size();
		System.out.println( "boardList 개수 : " + listCnt );
	}

}
