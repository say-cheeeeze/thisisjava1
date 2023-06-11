package chap14.thread.ex08_wait_notify;

public class Ex1 {
	
	public static void main( String[] args ) {
	
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA( workObject );
		ThreadB threadB = new ThreadB( workObject );
		
		threadA.start();
		threadB.start();
	}
}
