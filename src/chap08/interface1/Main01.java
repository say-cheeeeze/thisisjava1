package chap08.interface1;

import java.rmi.Remote;

public class Main01 {
	
	public static void main( String[] args ) {
		
		RemoteControl rc;
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume( 150 );
		rc.setMute( true );
		rc.setMute( false );
		rc.getVolume();
		rc.turnOff();
		RemoteControl.changeBattery();
		
	}
}
