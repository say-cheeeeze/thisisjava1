package chap01.enum1;

public enum Fruits {
	
	BANANA(5),
	ORANGE(10),
	YELLOW(15),
	GRAPE(20);
	
	private final int value;
	Fruits( int value ) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
