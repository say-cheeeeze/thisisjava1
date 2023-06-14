package chap16_lambda.constructorreference;

public class Ex {

	public static void main( String[] args ) {
		
		Person person = new Person();
		
		Member member1 = person.getMember1( Member::new );

		/**
		 * 위 코드는 원래 아래와 같다.
		 */
		Member member2 = person.getMember1( new Creatable1() {
			@Override
			public Member createMember(String id) {
				Member member = new Member( id );
				return member;
			}
		});
		
		System.out.println( member1 );
		System.out.println( member2 );
		
		/////////////////////////////////////////////////
		
		// 메소드 타입 및 개수에 따라 컴파일러가 알맞는 생성자 선택
		Member member3 = person.getMember2( Member::new );
		System.out.println( member3 );
		
		
	}
}
