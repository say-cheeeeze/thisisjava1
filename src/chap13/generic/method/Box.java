package chap13.generic.method;

public class Box<T> {
	
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT( T t ) {
		this.t = t;
	}
}
