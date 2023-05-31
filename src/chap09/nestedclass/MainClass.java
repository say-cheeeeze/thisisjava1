package chap09.nestedclass;

public class MainClass {
	public static void main( String[] args ) {
		ClassA classA = new ClassA();
		classA.method1();
		
		// 정적 멤버 클래스 생성방법. 바로 만들 수 있다.
		ClassA.StaticClass staticClass = new ClassA.StaticClass();
		System.out.println( staticClass.className );
		
		// 인스턴스 멤버 클래스 생성방법
		// 인스턴스 객체.new 생성자() 를 통해 만들어야한다.
		ClassA.MemberClass memberClass = classA.new MemberClass();
		System.out.println( memberClass.className );
	}
}
