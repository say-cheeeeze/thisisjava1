package chap14.thread.ex05_not_synchronized;

public class ThreadA extends Thread {
	
	private CalculInfo calculInfo;
	
	public ThreadA( String name ) {
		setName( name );
	}
	
	public void setCalculInfo( CalculInfo calculInfo ) {
		this.calculInfo = calculInfo;
	}
	
	@Override public void run() {
		calculInfo.setNumber1( 100 );
	}
}
