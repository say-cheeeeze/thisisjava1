package chap16_lambda.functionalinterface;

/**
 * 함수형 인터페이스는 단 하나의 추상 메소드만을 갖는다.
 * @author cheeeeze
 *
 */
public class Ex1 {

	public static void main( String[] args ) {
		
//		test1();
		
		test2();
		
	}
	
	public static void test2() {
		
		Button btnOk = new Button();
		btnOk.setClickListener( () -> System.out.println( "OK 버튼 클릭" ) );
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener( () -> System.out.println( "취소 버튼 클릭" ) );
		btnCancel.click();
		
	}
	
	public static void test1() {

		
		action( ( x, y ) -> {
			int result = x + y;
			System.out.println( result );
		} );
		
		action( new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println( x * y );
			}
		});
		
		Workable work = new Workable() {
			@Override
			public void work() {
				System.out.println( "일해라..." );
			}
		};
		work.work();
		
		toWork( () -> { System.out.println( "일하셈" ); });
	}
	
	public static void toWork( Workable work ) {
		work.work();
	}
	
	public static void action( Calculable calculable ) {
		int x = 10;
		int y = 4;
		calculable.calculate(x, y);
	}
	
}
