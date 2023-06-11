package chap14.thread.ex05_not_synchronized;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		CalculInfo calculInfo = new CalculInfo();
	
		ThreadA threadA = new ThreadA( "ThreadA" );
		ThreadB threadB = new ThreadB( "ThreadB" );
		
		threadA.setCalculInfo( calculInfo );
		threadB.setCalculInfo( calculInfo );
		
		threadA.start();
		threadB.start();
	}
}
