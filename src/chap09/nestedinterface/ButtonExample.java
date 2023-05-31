package chap09.nestedinterface;

public class ButtonExample {
	public static void main( String[] args ) {
		
		Button btnOK = new Button();
		
		// 로컬 클래스로 클릭 이벤트를 처리할 ClickListener 구현 클래스
		class OKListener implements Button.ClickListener {
			
			@Override public void onClick() {
				System.out.println( "OK 버튼을 클릭했습니다." );
			}
		}
		
		// btnOK 버튼 객체에 ClickListener 구현 객체 주입
		btnOK.setClickListener( new OKListener() );
		btnOK.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener {
			
			@Override public void onClick() {
				System.out.println( "Cancel 버튼을 클릭했습니다." );
			}
		}
		
		btnCancel.setClickListener( new CancelListener() );
		btnCancel.click();
	}
	
}
