package JAVA_std.Week05.Thread2.sync;

public class Main {
    public static void main(String[] args) {
        AppleStore appleStore = new AppleStore();

        Runnable task = () -> {
            while (appleStore.getStoredApple() > 0) {
                appleStore.eatApple(); //3개의 thread가 동시에 eat을 하려고 들어 충돌 발생
                System.out.println("남은 사과의 수 = " + appleStore.getStoredApple());
            }

        };

        // 3개의 thread를 한꺼번에 만들어 start!
        // 생성(NEW)과 동시에 start(Runnable)
        for (int i = 0; i < 3; i++) {
            // thread A, B, C
            new Thread(task).start();
        }
    }
}

class AppleStore {
    private int storedApple = 10;

    public int getStoredApple() {
        return storedApple;
    }

    public void eatApple() {
        synchronized (this) { // sync(동기화) 해줌으로서 한 thread가 로직을 수행하는 동안 다른 thread들은 기다린다.
            if (storedApple > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                storedApple -= 1;
            }
        }
    }
}