package chap09.nestedclass;

/**
 * 중첩클래스 Nested Class
 *
 * 클래스 내부에 선언한 클래스.
 * 중첩 클래스를 사용하면 클래스의 멤버를 쉽게 사용할 수 있고
 * 외부에는 중첩 관계 클래스를 감춤으로써 코드의 복잡성을 줄일 수 있다.
 *
 * 중첩 클래스는 선언하는 위치에 따라 두 가지로 분류됨.
 * 클래스 멤버로서 선언되는 중첩클래스 = 멤버 클래스
 * 메소드 내부에서 선언되는 중첩 클래스 = 로컬 클래스.
 */
public class ClassA {
	
	void method1() {
		class B {
			String name;
			int age;
		}
	}
	
	class B {
		// 멤버클래스.
		// ClassA 객체를 생성해야하지만 B 객체를 생성할 수 있다.
	}
	
	static class C {
		// ClassA 객체를 생성하지 않아도 C 객체를 생성할 수 있다.
	}
}
