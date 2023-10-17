package Week05.demon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i + " 번째 demondemondemon");
            }
        };

        //우선순위가 낮다. => 다른 스레드에 비해 상대적으로 리소스를 적게 할당받는다.
        Thread thread = new Thread(demon);
        thread.setDaemon(true); // true로 설정시 데몬스레드로 실행됨

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " 번째 task");
        }
    }
}