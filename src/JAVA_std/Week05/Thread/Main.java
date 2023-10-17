package JAVA_std.Week05.Thread;

public class Main {
    public static void main(String[] args) {
        // (1) Thread
//        TestThread thread = new TestThread();
//        thread.start();

        // (2) Runnable
//        Runnable run = new TestRunnable();
//        Thread thread = new Thread(run);
//        thread.start();

        // (3) 람다 => 멀티 스레드 방식
        Runnable task = () -> {
            int sum = 0;
            for (int i = 0; i < 50; i++) {
                sum += i;
                System.out.println(sum);
            }
            System.out.println(Thread.currentThread().getName() + " 최종 합 : " + sum);
        };
        //한 Thread안에서 두 개의 스레드를 실행 => 멀티 스레드
        Thread thread1 = new Thread(task);
        thread1.setName("thread1");
        Thread thread2 = new Thread(task);
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
        //멀티스레드, 병렬 실행이라고 완전 같이 실행 되는 건 아니더라.
    }
}
