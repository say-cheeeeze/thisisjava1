package chap08.interfaceimplement;

public class ImplementsExample {
	
	public static void main( String[] args ) {
	
		BoardServiceImpl boardService = new BoardServiceImpl();
		boardService.getListAll();
		boardService.getListReplyAll();
		boardService.delete();
		boardService.checkUser();
		boardService.save();
		boardService.write();
		boardService.saveReply();
		boardService.deleteReply();
		
		ReplyService replyService = new BoardServiceImpl();
		replyService.deleteReply();
		replyService.saveReply();
		replyService.deleteReply();
		
		UserService userService = new BoardServiceImpl();
		userService.checkUser();
		
		/**
		 * 인터페이스 다중상속 가능하며,
		 * 해당 인터페이스를 구현한 구현 클래스에서는
		 * 인터페이스의 모든 추상메서드 + 그 인터페이스가 상속한 모든 추상 메서드를 구현해야한다.
		 *
		 * 인터페이스 구현 객체의 타입은 인터페이스에 맞게 생성하면,
		 * 해당 인터페이스의 추상 메서드만 모두 구현하면 된다.
		 *
		 */
	}
}
