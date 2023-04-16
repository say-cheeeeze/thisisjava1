package chap01.accessModifier.public1;

public class Access1 {
	
	public String accessLevel = "public";
	
	public Access1(){
		System.out.println( "기본 생성자 호출" );
	}
	
	public Access1( String accessLevel ) {
		System.out.println( "accessLevel 을 초기화하는 생성자 호출");
		this.accessLevel = accessLevel;
	}
}
