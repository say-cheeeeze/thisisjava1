package chap17_stream.sort;

public class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	
	public Student( String name, int age ) {
		this.name = name;
		this.score = age;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	/**
	 * score 와 o.score 가 같으면 0 을 반환,
	 * score 가 o.score 보다 작을 경우 음수 반환, 클 경우 양수 반환
	 */
	@Override
	public int compareTo(Student o) {

        // return (x < y) ? -1 : ((x == y) ? 0 : 1);
		return Integer.compare( this.score, o.score);
	}

}
