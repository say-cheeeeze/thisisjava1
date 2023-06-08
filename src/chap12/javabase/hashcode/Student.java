package chap12.javabase.hashcode;

import java.util.StringTokenizer;

public class Student {
	
	private int no;
	private String name;
	
	public Student( int no, String name ) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {
		return this.no;
	}
	
	public String getName() {
		return this.name;
	}
	
	/*
	@Override public int hashCode() {
		System.out.println( "override" );
		return this.no + this.name.hashCode();
	}
	 */
	
	@Override public boolean equals( Object obj ) {
		if ( obj instanceof Student student ) {
			if ( this.no == student.getNo() && this.name.equals( student.getName() ) ) {
				return true;
			}
		}
		return false;
	}
	
	public static void main( String[] args ) {
		String s = "이름,패스워드,학번";
		StringTokenizer st = new StringTokenizer( s, "," );
		while( st.hasMoreTokens() ) {
			System.out.println( st.nextToken() );
		}
	}
}
