package chap16_lambda.ex1;

public class Ex {

	public static void main( String[] args ) {
		
		Button btnOk = new Button();
		btnOk.setClickListener( () ->  System.out.println( "OK 버튼 클릭 " ) );
		
		btnOk.click();
	}
}
