package chap01.accessModifier.singleton;

public class Main1 {
	
	public static void main( String[] args ) {
	
		ShopService shopService1 = ShopService.getInstance();
		ShopService shopService2 = ShopService.getInstance();
		
		if ( shopService1 == shopService2 ) {
			System.out.println( "같은 객체" );
		}
		else {
			System.out.println( "다른 객체" );
		}
	}
}
