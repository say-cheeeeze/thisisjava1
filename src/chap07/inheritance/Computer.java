package chap07.inheritance;

public class Computer extends Calculator {
	
	@Override
	public double areaCircle( double r ) {
		System.out.println( "Computer 객체의 areaCircle...");
		return Math.PI * r * r;
	}
}
