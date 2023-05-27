package chap08.interfaceimplement;

public interface BoardService extends ReplyService, UserService {
	
	// 글 작성합니다.
	void write();
	
	// 게시물 전체 조회
	void getListAll();
	
	// 게시물 저장
	void save();
	
	// 게시글 삭제
	void delete();
}
