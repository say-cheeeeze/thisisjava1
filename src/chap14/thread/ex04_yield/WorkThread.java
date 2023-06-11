package chap14.thread.ex04_yield;

public class WorkThread extends Thread {
	
	public boolean work = true;
	
	public WorkThread( String name ) {
		setName( name );
	}
	
	@Override public void run() {
		
		while( true ) {
			
			if ( work ) {
				System.out.println( getName() + "가 작업중..." );
			}
			else {
				Thread.yield();
			}
			try {
				Thread.sleep( 1000 );
			}
			catch ( InterruptedException e ) {
				throw new RuntimeException( e );
			}
		}
	}
}
