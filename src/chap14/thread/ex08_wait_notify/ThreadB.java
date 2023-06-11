package chap14.thread.ex08_wait_notify;

public class ThreadB extends Thread {
	
	private WorkObject workObject;
	
	public ThreadB( WorkObject workObject ) {
		setName( "ThreadB" );
		this.workObject = workObject;
	}
	
	@Override public void run() {
		for( int i = 0; i < 10; i++ ) {
			System.out.println( " B (" + i + ")" );
			workObject.methodB();
		}
	}
}
