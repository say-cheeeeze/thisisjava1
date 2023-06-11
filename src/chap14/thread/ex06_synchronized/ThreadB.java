package chap14.thread.ex06_synchronized;

public class ThreadB extends Thread {
	
	private CalculInfo calculInfo;
	
	public ThreadB( String name ) {
		setName( name );
	}
	
	public void setCalculInfo( CalculInfo calculInfo ) {
		this.calculInfo = calculInfo;
	}
	
	@Override public void run() {
		System.out.println( this.getName() + " : " + this.getState() );
		calculInfo.setNumber2( 50 );
	}
}
