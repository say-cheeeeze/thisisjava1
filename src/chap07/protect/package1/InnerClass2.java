package chap07.protect.package1;

import chap07.protect.A;

public class InnerClass2 extends A {
	
	public InnerClass2() {
		super();
	}
	
	public static void main( String[] args ) {
		
		InnerClass2 innerClass2 = new InnerClass2();
		innerClass2.method();
		
	}
}
