package JAVA_std.Week05.Thread;

public class TestRunnableT implements Runnable {
    @Override
    public void run() {
        //스레드에서 수행할 작업 정의
        System.out.println("잡았나?");
        for (int i = 0; i<100; i++){
            System.out.print("$");
        }
    }
}
