package JAVA_std.Week05.Thread;

public class TestThreadT extends Thread{
    @Override
    public void run() {
        // 실제 우리가 스레드에서 수행할 작업
        System.out.println("해치웠나?");
        for (int i=0; i<100; i++) {
            System.out.print("*");
        }
    }

}
