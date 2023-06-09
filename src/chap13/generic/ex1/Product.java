package chap13.generic.ex1;

/**
 * 제너릭타입 클래스 연습
 * @param <K>
 * @param <M>
 */
public class Product<K,M> {
	
	private K kind;
	private M model;
	
	public K getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind( K kind ) {
		this.kind = kind;
	}
	
	public void setModel( M model ) {
		this.model = model;
	}
}
