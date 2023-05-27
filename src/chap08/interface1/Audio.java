package chap08.interface1;

public class Audio implements RemoteControl {
	
	private int volume;
	
	@Override public void turnOn() {
		System.out.println( "오디오를 켭니다...");
	}
	
	@Override public void turnOff() {
		System.out.println( "오디오를 끕니다.." );
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
	
	/**
	 * 인터페이스의 default 메서드를 재정의할 수 있다.
	 * @param mute
	 */
	@Override
	public void setMute( boolean mute ) {
		// RemoteControl.super.setMute( mute );
		if ( mute ) {
			System.out.println( "오디오를 음소거합니다..." );
			this.volume = RemoteControl.VOLUME_MIN;
		}
		else {
			System.out.println( "음소거를 해제합니다.");
			System.out.println( "최소 음량은 1 입니다." );
			this.volume = 1;
		}
		
	}
}
