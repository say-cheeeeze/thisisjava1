package chap08.interfaceimplement;

public class BoardServiceImpl implements BoardService {
	
	@Override public void write() {
		System.out.println( "글을 작성합니다." );
	}
	
	@Override public void getListAll() {
		System.out.println( "게시글 목록을 호출합니다." );
	}
	
	@Override public void save() {
		System.out.println( "게시글을 저장합니다." );
	}
	
	@Override public void delete() {
		System.out.println( "게시글 단건을 삭제합니다." );
	}
	
	@Override public void checkUser() {
		System.out.println( "사용자 권한을 검사합니다." );
	}
	
	@Override public void deleteReply() {
		System.out.println( "댓글을 삭제합니다." );
	}
	
	@Override public void saveReply() {
		System.out.println( "댓글을 저장합니다." );
	}
	
	@Override public void getListReplyAll() {
		System.out.println( "댓글 목록을 조회합니다." );
	}
}
