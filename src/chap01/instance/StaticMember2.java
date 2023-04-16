package chap01.instance;

public class StaticMember2 {
	
	public static void main( String[] args ) {
		
		StaticMember.thisYear = 30000;
		System.out.println( StaticMember.info );
		
		StaticMember st1 = new StaticMember();
		
		
		// 정적 요소는 클래스 이름으로 접근하는 것이 정석이다.
		// 만약 static 멤버를 인스턴스 객체 참조 변수를 통해 접근하는 경우 경고 표시가 뜬다.
		// Static member 'chap01.instance.StaticMember.thisSeason' accessed via instance reference
		int st1Year = st1.thisYear;
		String st1Season = st1.thisSeason;
		
		StaticMember st2 = new StaticMember();
		int st2Year = st2.thisYear;
		String st2Season = st2.thisSeason;
		
		System.out.println( st1Year == st2Year );
		System.out.println( st1Season.equals( st2Season ) );
		
		StaticMember.thisYear = 2033;
		System.out.println( StaticMember.thisYear );
		System.out.println( StaticMember.info );
		
		System.out.println( StaticMember.nation );
		
//		StaticMember.nation = "123";
	}
}
