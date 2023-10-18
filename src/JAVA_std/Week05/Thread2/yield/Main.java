package JAVA_std.Week05.Thread2.yield;

// 남은 시간을 다음 스레드에게 양보 => 스레드 자신은 실행대기 상태

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                }
            } catch (InterruptedException e) { // (3) thread1이 (2)되어 예외식을 수행
                Thread.yield(); // => thread1이 (2)로인해 멈추면서 남는 시간 양도
                e.printStackTrace();// ↑=> 아직 수행중인 thread2에 남는 시간이 양도
            }
        };

        Thread thread1 = new Thread(task, "thread1"); // NEW
        Thread thread2 = new Thread(task, "thread2"); // NEW

        thread1.start(); // Runnable
        thread2.start(); // Runnable

        try {
            Thread.sleep(5000); //(1) 실행중인 thread들에 sleep을 검
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.interrupt(); // (2)thread1이 수행 중 (1)로인해 5초 뒤 실행대기상태로 전환 되어버림
                            // thread2는 여전히 수행

    }
}