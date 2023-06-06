package chap11.mytrywithresource;

public class Ex1 {
	
	public static void main( String[] args ) {
		
		String resourceName = "yoonjae";
		MyResource myResource = new MyResource( resourceName );
		try ( myResource; ) {
			
			System.out.println( "getResource : " + myResource.getResource() );
			
		}
		catch( Exception e ) {
			System.out.println( e.getMessage() );
		}
		System.out.println( "after finally getResource : " + myResource.getResource() );
	}
}
