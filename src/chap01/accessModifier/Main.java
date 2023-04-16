package chap01.accessModifier;

import chap01.accessModifier.public1.Access1;
import chap01.accessModifier.singleton.SingletonPattern1;

public class Main {
	
	public static void main( String[] args ) {
		
		// public 클래스는 다른 패키지에서도 접근이 가능함.
		Access1 access1 = new Access1();
		System.out.println( access1.accessLevel );
		
		Access1 access2 = new Access1( "공통" );
		System.out.println( access2.accessLevel );
		
		// protected 는 같은 패키지이거나 자식 객체가 아니면 접근할 수 없다.
		// Default1 default1 = new Default1(); // X : 생성자 호출 불가
		
		// default 도 같은 패키지에서만 접근할 수 있다.
		// 상위패키지라고 해서 접근할 수 있는게 아니다.
		
		// private 패키지는 객체 내부에서만 접근 가능하다.
		
		// 또 객체를 생성하기 위해 생성자를 아무데서나 호출할 수 있는게 아니다
		// 접근지정자는 클래스 자체에도 있지만(public, default)
		// 생성자에도 있기 때문이다(public, protected, default, private)
		
		SingletonPattern1 singleton1 = SingletonPattern1.getInstance();
		SingletonPattern1 singleton2 = SingletonPattern1.getInstance();
		System.out.println( singleton1 == singleton2 );
		
		int hashCode1 = singleton1.hashCode();
		int hashCode2 = singleton2.hashCode();
		System.out.println( hashCode1 );
		System.out.println( hashCode2 );
		System.out.println( hashCode1 == hashCode2 );
		
	}
	
	
}
