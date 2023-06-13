package chap16_lambda.functionalinterface.ex2;

public class Person {
	
	private String name;
	private String job;
	private int dutyTime;
	private String greetings;
	
	public Person( String name, String job, int dutyTime, String greetings ) {
		this.name = name;
		this.job = job;
		this.dutyTime = dutyTime;
		this.greetings = greetings;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setDutyTime(int dutyTime) {
		this.dutyTime = dutyTime;
	}
	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}
	
	public String getJob() {
		return job;
	}
	public String getName() {
		return name;
	}
	public int getDutyTime() {
		return dutyTime;
	}
	public String getGreetings() {
		return greetings;
	}
	
	public void action1( Workable workable ) {
		workable.work( job, dutyTime );
	}
	
	public void action2( Speakable speakable ) {
		speakable.speak( greetings );
	}

}
