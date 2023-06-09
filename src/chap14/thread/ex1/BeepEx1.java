package chap14.thread.ex1;

import java.awt.*;

/**
 * 메인 스레드가 동시에 두 가지 작업을 처리할 수 없음을 보여주는 예제.
 * 원래 목적은 0.5초 주기로 비프음을 발생시키면서 print 도 하는 작업이지만,
 * 메인 스레드는 비프음을 모두 발생시킨 후에야 프린팅 코드를 실행한다.
 */
public class BeepEx1 {
	public static void main( String[] args ) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for( int i = 0; i < 5; i++ ) {
			toolkit.beep();
			
			try {
				System.out.println("1초 정지..");
				Thread.sleep( 1000 );
			}
			catch ( InterruptedException e ) {
				e.printStackTrace();
			}
		}
		
		for( int i = 0; i < 5; i++ ) {
			System.out.println("프린트!");
		}
	}
}
