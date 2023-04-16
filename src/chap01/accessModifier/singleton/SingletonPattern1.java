package chap01.accessModifier.singleton;

/**
 * 싱글톤 패턴
 * :: 애플리케이션에서 단 하나의 객체만 생성하도록 한다.
 * 싱글톤 패턴의 핵심은 ?
 * 생성자를 private 로 제한하여 외부에서 new 연산자로 생성자를 호출할 수 없도록
 * 하는 것이다.
 *
 * 생성자를 호출할 수 없으니 마음대로 외부에서 객체를 생성못한다.
 * 대신 싱글톤 패턴이 제공하는 정적 메소드를 통해 간접적으로 객체를 생성할 수 있다.
 *
 */
public class SingletonPattern1 {
	
	/**
	 * 예제
	 * private 접근권한을 갖는 정적 필드 선언과 초기화
	 * private static 클래스 singleton = new 클래스();
	 *
	 * private 접근 권한을 갖는 생성자 선언
	 * private 클래스 {}
	 *
	 * public 접근권한을 갖는 정적 메서드 선언
	 * public static 클래스 getInstance() {
	 *     return singleton;
	 * }
	 */
	
	/**
	 * 자신의 타입을 정적 필드로 선언하고 미리 객체를 선언해서 초기화시켜버린다.
	 * 그리고 private 클래스를 붙여서 외부에서 정적 필드값을 변경하지 못하도록 하고,
	 * 정적 필드값을 반환하는 getInstance 메서드를 public 으로 선언한다.
	 * 외부에서 객체를 얻는 유일한 방법은 getInstance() 메서드를 호출하는 것 뿐이다.
	 * 정적 필드가 참조하는 객체 하나를 반환한다.
	 */
	
	private static SingletonPattern1 singleton = new SingletonPattern1();
	
	private static final int hashCode = singleton.hashCode();
	
	private SingletonPattern1() {
	}
	
	public static SingletonPattern1 getInstance() {
		return singleton;
	}
}
