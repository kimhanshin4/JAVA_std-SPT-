package JAVA_std.Week05.Thread2.inturrupt;

//public class Main {
//    public static void main(String[] args) { // while문으로 try를 감싸지 않은 로직
//        Runnable task = () -> {
//            try {
//
//                Thread.sleep(1000);
//                System.out.println(Thread.currentThread().getName());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("task : " + Thread.currentThread().getName());
//        };
//
//        Thread thread = new Thread(task, "Thread"); // NEW
//        thread.start(); // Runnable
//
//        thread.interrupt();
//
//        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());
//
//    }
//}

public class Main {
    public static void main(String[] args) { // while문으로 try를 감싼 로직
        Runnable task = () -> {
            while (!Thread.currentThread().isInterrupted()) { // while문으로 interrupted가 아닐 때문 try로직을 수행하도록
                try {   // Interrupted상태가 아닐 경우에만 로직을 수행 => 에러메세지 안뜨게 됨
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt();

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}