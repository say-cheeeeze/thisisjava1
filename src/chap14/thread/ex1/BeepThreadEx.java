package chap14.thread.ex1;

import java.awt.*;

/**
 * 메인 스레드에서 프린팅을 담당.
 * 작업 스레드에서 비프음을 담당.
 */
public class BeepThreadEx {
	
	public static void main( String[] args ) {
		
		Thread beepThread = new Thread( new Runnable() {
			
			@Override public void run() {
				
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for( int i = 0; i < 5; i++ ) {
					toolkit.beep();
					
					try {
						System.out.println("beep!");
						Thread.sleep( 1000 );
					}
					catch ( InterruptedException e ) {
						e.printStackTrace();
					}
				}
			}
		} );
		
		beepThread.start();
		
		for( int i = 0; i < 5; i++ ) {
			System.out.println( i + 1 + ") 띵 ");
			try {
				Thread.sleep( 1000 );
				
			}
			catch( InterruptedException e ) {
				e.printStackTrace();
			}
		}
		System.out.println( "쓰레드의 개수 : " + Thread.activeCount() );
		
	}
}
