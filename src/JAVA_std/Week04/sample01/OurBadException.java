package JAVA_std.Week04.sample01;

// 예외 클래스를 만들어 예외를 정의
public class OurBadException extends Exception {
    public OurBadException () {
        super("위험한 행동을 하면 예외처리를 꼭 해야해!");
    }

}
