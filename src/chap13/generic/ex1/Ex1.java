package chap13.generic.ex1;

public class Ex1 {
	
	public static void main( String[] args ) {
	
		Product<TV, String> product1 = new Product<>();
		product1.setKind( new TV() );
		product1.setModel( "스마트TV" );
		
		TV tv = product1.getKind();
		String modelName = product1.getModel();
		System.out.println( tv.getClass().getSimpleName() );
		System.out.println( modelName );
		
		//////////////////////////////////////////////
		
		// 부동산과 차 임대하기
		RealEstate estate = new RealEstate();
		Apartment apartment = estate.rent();
		
		CarAgency agency = new CarAgency();
		Car car = agency.rent();
		
	}
}
