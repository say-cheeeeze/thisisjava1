package chap14.thread.ex6_synchronized;

public class ThreadA extends Thread {
	
	private CalculInfo calculInfo;
	
	public ThreadA( String name ) {
		setName( name );
	}
	
	public void setCalculInfo( CalculInfo calculInfo ) {
		this.calculInfo = calculInfo;
	}
	
	@Override public void run() {
		System.out.println( this.getName() + " : " + this.getState() );
		calculInfo.setNumber1( 100 );
	}
}
