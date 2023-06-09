package chap13.generic.wildcard;

/**
 * 수강 신청
 */
public class Course {
	
	public void registAll( Applicant<?> applicant ) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "가 전체 과정을 등록했습니다." );
	}
	
	public void registAdult( Applicant<? extends Adult> applicant ) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "가 성인 과정을 등록했습니다." );
	}
	
	public void registOverHigh( Applicant<? super HighStudent> applicant ) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "가 고등학생 이상 과정을 등록했습니다." );
	}
	
	public void registOnlyTeenager( Applicant<? extends Teenager> applicant ) {
		System.out.println( applicant.kind.getClass().getSimpleName() + "가 청소년 과정을 등록했습니다." );
	}
}
