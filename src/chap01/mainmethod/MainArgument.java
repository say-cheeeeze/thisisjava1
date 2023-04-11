package chap01.mainmethod;

public class MainArgument {
	
	public static void main( String[] args ) {
		
		System.out.println( args.length );
		
		if ( args.length < 1 ) {
			return;
		}
		
		for( String arg : args ) {
			System.out.println( arg );
		}
	}
}
