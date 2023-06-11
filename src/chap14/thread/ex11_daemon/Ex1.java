package chap14.thread.ex11_daemon;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		Daemon1 daemon1 = new Daemon1();
		Thread1 thread1 = new Thread1();
		thread1.setName( "일반Thread" );
		
		daemon1.setDaemon( true );
		daemon1.setName( "Daemon Thread" );
		
		daemon1.start();
		thread1.start();
		
		try {
			Thread.sleep( 2000 );
		}
		catch ( InterruptedException e ) {
		
		}
		
		System.out.println( "메인 스레드 종료...." );
		System.out.println( "Thread Active Cnt : " + Thread.activeCount() );
		System.out.println( Thread.currentThread().getName() );
		Thread.currentThread().getThreadGroup().list();
	}
}
