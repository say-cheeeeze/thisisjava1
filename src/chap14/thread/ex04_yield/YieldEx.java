package chap14.thread.ex04_yield;

public class YieldEx {
	
	public static void main( String[] args ) {
	
		WorkThread workThread1 = new WorkThread( "thread1" );
		WorkThread workThread2 = new WorkThread( "thread2" );
		workThread1.start();
		workThread2.start();
		
		try {
			Thread.sleep( 5000 );
			System.out.println( "############# 5초 지남 #########");
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		workThread1.work = false;
		
		try {
			Thread.sleep( 10000 );
			System.out.println( "############# 10초 지남 #########");
		}
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		workThread1.work = true;
		
		
		
	}
}
