package chap01.control;

/**
 * switch문
 */
public class Switch1 {
	
	public static void main( String[] args ) {
		
		/**
		 * java 12 부터는 swtich 문에서 Expression(표현식) 을 사용할 수 있다.
		 */
		char grade = 'B';
		
		switch ( grade ) {
			
			case 'A', 'a' -> {
				System.out.println( "우수 회원이니다." );
			}
			case 'B', 'b' -> {
				System.out.println( "일반 회원입니다." + grade );
			}
			case 'C', 'c' -> {
				System.out.println( "손님입니다." );
			}
		
		}
		
		/**
		 * java13 부터는 switch Expression 으로 스위치된 값을 변수에 대입 가능
		 */
		String level = "B";
		int score = switch ( level ) {
			case "A" -> 100;
			case "B" -> {
				int result = 100 - 20;
				yield result; // return 같은 느낌
			}
			default -> 60;
		};
		
		System.out.println( score );
	}
}
