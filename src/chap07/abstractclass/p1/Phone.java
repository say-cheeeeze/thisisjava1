package chap07.abstractclass.p1;

public abstract class Phone {
	
	String owner;
	
	// 추상클래스는 반드시 생성자가 있어야한다.
	// 자식 객체가 super() 를 통해 이 생성자를 불러야하기 때문
	Phone( String owner ) {
		this.owner = owner;
	}
	
	void turnOn() {
		System.out.println( "전원을 켭니다." );
	}
	
	void turnOff() {
		System.out.println( "전원을 끕니다." );
	}
}
