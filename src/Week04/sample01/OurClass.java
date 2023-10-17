package Week04.sample01;

public class OurClass {
    private final boolean just = true;

    //throws : 던지다! =>예외를 던지다 / 발생시키다
    //그냥 Exception예외처리는 되지만 예외 클래스가 더 구체적.
    public void thisMethodIsDangerous () throws OurBadException {
        // custom logic~!
        if (just) {
            throw new OurBadException();
        }
    }
}
