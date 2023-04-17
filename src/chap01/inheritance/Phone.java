package chap01.inheritance;

public class Phone {

    public String model;
    public String color;

    public void bell() {
        System.out.println( "벨이 울립니다." );
    }

    public void sendVoice( String message ) {
        System.out.println( "자신 : " + message );
    }

    public void receiveVoice( String message ) {
        System.out.println( "상대방 : " + message );
    }

    public void hangUp() {
        System.out.println( "전화를 끊습니다." );
    }

}
