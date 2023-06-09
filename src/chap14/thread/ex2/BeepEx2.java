package chap14.thread.ex2;

public class BeepEx2 {
	
	public static void main( String[] args ) {
	
		BeepThread beepThread = new BeepThread();
		PrintThread printThread = new PrintThread();
		
		beepThread.start();
		Thread mainThread = Thread.currentThread();
		System.out.println( "mainThread.getName() : " + mainThread.getName() );
		
		printThread.start();
		
		Thread thread3 = new Thread() {
			
			@Override public void run() {
				//... code
				
				// 스레드 이름을 출력
				System.out.println( "이 스레드의 이름.....: " + getName() );
			}
		};
		thread3.setName( "3rd Thread" );
		thread3.start();
		
	}
}
