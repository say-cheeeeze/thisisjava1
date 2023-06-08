package chap12.javabase;

public class Base {
	
	public String id;
	
	public Base( String id ) {
		this.id = id;
	}
	
	@Override public boolean equals( Object obj ) {
		if ( obj instanceof Base target ) {
			if ( id.equals( target.id ) ) {
				return true;
			}
		}
		return false;
	}
}
