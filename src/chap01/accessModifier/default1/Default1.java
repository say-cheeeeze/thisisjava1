package chap01.accessModifier.default1;

class Default1 {
	
	String accessLevel = "default";
	
	Default1() {
		// default 접근지정자 생성자
		// 같은 패키지에서만 호출이 가능하다.
		System.out.println( "default 접근지정자 생성자" );
	}
}
