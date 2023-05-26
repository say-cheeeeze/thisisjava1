package chap07.abstractclass.p1;

public class SmartPhone extends Phone {
	
	SmartPhone( String owner ) {
		super( owner );
	}
	
	void internetSearch() {
		System.out.println( "SmartPhone 인터넷 검색을 합니다." );
	}
}
