package JAVA_std.Week05.Thread2.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                // (1) 예외처리 필수!
                // - interrupt() 를 만나면 다시 실행되기 때문에
                // - interruptedException이 발생할 수 있다.
                // (2) 특정 스레드 지목 불가
                Thread.sleep(2000); // sleep이라는 예외자체로 위험하기에 try문으로 감싸서 예외처리를 해줘야함.
                //주로 객체.메서드();
                //public static void 'sleep'
                // => 특정 객체 지칭x -> 어떠한 흐름 안에서 스레드 자체를 sleep

            } catch (InterruptedException e) { //sleep 진행중 예외를 발생시켜 대기상태로 보내버림 => sleep문이 꺠짐
                e.printStackTrace(); // => 예외시의 상황 발생시킴
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread"); // NEW
        thread.start(); // NEW => RUNNABLE

        try {
            // 1초 지난 후 runnable 상태로 변해 다시 실행
            // 특정 스레드를 지목, 멈출 수 없다.
            //
            thread.sleep(1000);
//            Thread.sleep(1000); // ↑와 동일
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}