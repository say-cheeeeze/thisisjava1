package chap09.nestedinterface;

/**
 * 중첩 인터페이스
 */
public class Button {
	
	public static interface ClickListener {
		
		// 추상메소드
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener( ClickListener clickListener ) {
		this.clickListener = clickListener;
	}
	
	/**
	 * 버튼 클릭 시 실행하는 메소드
	 */
	public void click() {
		System.out.println( "Button Class >>> Button이 클릭됨" );
		this.clickListener.onClick();
	}
}
