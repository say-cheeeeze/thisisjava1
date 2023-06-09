package chap13.generic.wildcard;

public class Ex1 {
	public static void main( String[] args ) {
	
		Member member = new Member();
		Adult adult = new Adult();
		Teenager teenager = new Teenager();
		
		Applicant<Member> memberApplicant = new Applicant<>( member );
		Applicant<Adult> adultApplicant = new Applicant<>( adult );
		Applicant<Teenager> teenagerApplicant = new Applicant<>( teenager );
		
		Course course = new Course();
		
		// registAll(Applicant<?> applicant)
		course.registAll( memberApplicant );
		course.registAll( adultApplicant );
		course.registAll( teenagerApplicant );
		
		// registAdult( Applicant<? extends Adult> applicant )
		course.registAdult( adultApplicant );
		// course.registAdult( memberApplicant ); // X Member 는 Adult 를 extends 하지 않음.
		// course.registAdult( teenagerApplicant ); // X Teenager 는 Adult 를 extends 하지 않음.
		
		// course.registOverHigh( adultApplicant ); // X
		course.registOverHigh( memberApplicant );
		course.registOverHigh( teenagerApplicant );
		
	}
}
