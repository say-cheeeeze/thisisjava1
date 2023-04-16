package chap01.instance;

public class StaticMember {
	
	public static int thisYear = 2023;
	public static String thisSeason = "Spring";
	public static String info;
	
	public static final String nation = "KOREA";
	
	// 정적 블록
	// 정적 필드와 달리 복잡한 초기화 작업이 필요하다면 정적 블록을 이용해야 한다.
	static {
		
		// 정적블록은 클래스에 메모리에 로드될 때 실행된다.
		// 정적블록이 클래스 내부에 여러개 선언된 경우 선언된 순서대로 실행된다.
		System.out.println( "첫번쨰 static" );
		info = "이번 년도는 " + thisYear + "년이며 계절은 " + thisSeason +"입니다.";
	}
	
	static {
		System.out.println( "두번째 static" );
		info = "여기서 또 한번 초기화를 일으켜버뤼귀~~";
	}
}
