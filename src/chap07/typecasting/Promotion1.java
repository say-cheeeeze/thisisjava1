package chap07.typecasting;

/**
 * Promotion 이란 자동타입변환.
 * 자동적으로 타입변환이 일어나는 것.
 *
 * 자식타입객체 인스턴스는 부모타입객체로 자동타입변환이 가능하다.
 */

class A {
	
	public String parentName;
	void methodParent() {
		System.out.println( "A 의 메소드");
	}
}

class B extends A {
	public String childName;
	
	void methodChild() {
		System.out.println( "B의 메소드" );
	}
}

class C extends A {
	
	@Override
	void methodParent() {
		System.out.println( "C의 메소드" );
	}
}
class D extends B {

}
class E extends C {

}
public class Promotion1 {
	
	public static void main( String[] args ) {
		
		A a1 = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A parent1 = new B(); // B 생성자로 만들었지만 A 타입이다.
		parent1.parentName = "부모필드할당";
		parent1.methodParent();
		
		/**
		 * 자식 객체가 부모타입으로 자동 변환하면 부모 타입에 선언된 필드와 메소드만 사용 가능하다.
		 * 만약 자식 타입에 선언된 필드와 메소드를 꼭 사용해야한다면 강제 타입 변환을 해서
		 * 다시 자식 타입으로 변환해야 한다.
		 */
		// parent1.childName = "자식필드할당"; // 불가능
		// parent1.methodChild(); // 불가능
		B child = (B) parent1; // 자식 객체로 강제 타입 캐스팅을 한다.
		child.methodChild(); // 이제 사용가능함.
	}
}

