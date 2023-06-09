package chap13.generic.wildcard;

/**
 * 양식을 가지고 지원서 등록
 * @param <T>
 */
public class Applicant<T> {

	public T kind;
	
	public Applicant( T kind ) {
		this.kind = kind;
	}
}
