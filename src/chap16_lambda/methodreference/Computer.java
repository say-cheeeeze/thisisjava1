package chap16_lambda.methodreference;

public class Computer {
	
	public static double staticGetSum( double x, double y ) {
		System.out.println( "static double staticGetSum" );
		return x + y;
	}

	public double instanceGetSum( double x, double y ) {
		System.out.println( "double instanceGetSum" );
		return x + y;
	}
}
