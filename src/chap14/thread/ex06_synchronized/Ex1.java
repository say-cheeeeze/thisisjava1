package chap14.thread.ex06_synchronized;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		CalculInfo calculInfo = new CalculInfo();
	
		ThreadA threadA = new ThreadA( "ThreadA" );
		threadA.setCalculInfo( calculInfo );
		threadA.start();
		
		ThreadB threadB = new ThreadB( "ThreadB" );
		threadB.setCalculInfo( calculInfo );
		threadB.start();
	}
}
