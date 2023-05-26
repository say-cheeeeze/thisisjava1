package chap07.polymorphism;

public class HankookTire extends Tire {
	
	@Override
	public void roll() {
		System.out.println( "한국 타이어 회전합니다." );
	}
	
	@Override
	public void drive() {
		System.out.println( "한국타이어 주행합니다....." );
	}
	
	public void printHankookTire() {
		System.out.println( "한국타이어만의 기술력으로 세계를 정복합니다." );
	}
}
