package chap14.thread.ex02;

import java.awt.*;

public class BeepThread extends Thread {
	
	@Override
	public void run() {
		
		for( int i = 0; i < 5; i++ ) {
			
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			toolkit.beep();
			
			try {
				Thread.sleep( 1000 );
			}
			catch( InterruptedException e ) {
				e.printStackTrace();
			}
		}
		
	}
}
