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
		
		/**
		 * 로컬 클래스
		 * method 가 실행할 때만 생성된다.
		 */
		class LocalClass {
			LocalClass() {
				this.name = "yoonjae";
				this.age = 10;
			}
			String name;
			int age;
		}
		LocalClass localClass = new LocalClass();
		System.out.println( localClass.age );
		System.out.println( localClass.name );
	}
	
	void method2() {
		// LocalClass // X 위 로컬 클래스 생성 및 접근 불가
	}
	
	/**
	 * 인스턴스 멤버 클래스
	 * ClassA 객체를 생성 후에 객체를 생성할 수 있다.
	 */
	class MemberClass {
		public String className = "memberClass";
		
		// 정적 필드. Java 17 부터 허용.
		static int staticField = 2;
		
		static void method() {
			// 정적 메소드. Java 17 부터 허용.
		}
	}
	
	/**
	 * 정적 멤버 클래스
	 * ClassA 객체를 생성하지 않아도 객체를 생성할 수 있다.
	 */
	static class StaticClass {
		public String className = "staticClass";
	}
}
