package JAVA_std.Week05.Thread2.join;


// 정해진 시간동안 지정 스레드가 작업하는 걸 기다림.
// -시간을 지정하지 않았을 때는 지정한 스레드의 작업이 끝날 때까지 기다린다.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(5000); // 5초
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(task, "thread"); // NEW

        thread.start(); // Runnable

        long start = System.currentTimeMillis(); //소요된 시간이 얼마인지 알아보자


        //아래 join을 해주지 않으면 thread수행을 main이 기다려주지 않아 바로 끝남
        // =>소요시간 0초
        try {
            thread.join(); // join에 시간입력을 하지 않았기 때문에 thread가 수행을 마칠 때까지 main 대기

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // thread 의 소요시간인 5000ms 동안 main 쓰레드가 기다렸기 때문에 5000이상이 출력됩니다.
        System.out.println("소요시간 = " + (System.currentTimeMillis() - start));
    }
}