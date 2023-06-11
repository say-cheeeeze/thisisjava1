package chap14.thread.ex05_not_synchronized;

public class ThreadB extends Thread {
	
	private CalculInfo calculInfo;
	
	public ThreadB( String name ) {
		setName( name );
	}
	
	public void setCalculInfo( CalculInfo calculInfo ) {
		this.calculInfo = calculInfo;
	}
	
	@Override public void run() {
		calculInfo.setNumber2( 50 );
	}
}
