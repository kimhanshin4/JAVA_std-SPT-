package Week04.sample01;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();

        // try ~ catch ~ finally 구문
        // try : 시도하다
        // catch : 잡다
        // finally : 마침내

        // 일단 try, 그리다 예외 발생시 catch,
        // 그리고 정상작동하든, 예외발생하든, 마참내 수행되야 하는 로직을 finally 해라.

        try {
            // 일단 실행.
            ourClass.thisMethodIsDangerous();
        } catch (OurBadException e) {
            System.out.println(e.getMessage());
        } finally {
            //무조건 여기는 거친다.
            System.out.println("우리는 방금 예외를 handling 했다! 정상처리되든, 예외사항 발생하든 여기를 거쳐!");
        }
    }
}
