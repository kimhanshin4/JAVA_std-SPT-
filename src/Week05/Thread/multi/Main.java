package Week05.Thread.multi;

public class Main {
    public static void main(String[] args) {

        //걸리는 시간이나, 동작을 예측할 수 없다.
        //운영체제, 성능에 따라 다르다.

        //1
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("$");
            }
        };

        //2
        Runnable task2 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("*");
            }
        };


        Thread thread1 = new Thread(task); //1
        thread1.setName("thread1");
        Thread thread2 = new Thread(task2); //2
        thread2.setName("thread2");

        thread1.start();
        thread2.start();
    }
}