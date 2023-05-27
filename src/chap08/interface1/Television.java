package chap08.interface1;

public class Television implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println( "텔레비전을 켭니다.." );
	}
	
	@Override public void turnOff() {
		System.out.println( "텔레비전을 끕니다.." );
	}
	
	@Override public void setVolume( int volume ) {
		
		if ( volume < RemoteControl.VOLUME_MIN ) {
			volume = RemoteControl.VOLUME_MIN;
		}
		else if ( volume > RemoteControl.VOLUME_MAX ) {
			volume = RemoteControl.VOLUME_MAX;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println( "볼륨을 " + volume + "으로 조절합니다." );
		
	}
	
	@Override public int getVolume() {
		System.out.println( "현재 볼륨 : " + this.volume );
		return this.volume;
	}
}
