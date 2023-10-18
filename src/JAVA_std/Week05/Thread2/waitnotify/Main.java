package JAVA_std.Week05.Thread2.waitnotify;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String[] itemList = {
            "MacBook", "IPhone", "AirPods", "iMac", "Mac mini"
    };
    public static AppleStore appleStore = new AppleStore();
    public static final int MAX_ITEM = 5;

    public static void main(String[] args) {

        // 가게 점원
        Runnable StoreClerk = () -> {
            while (true) { //true => while문 무한 반복 *오류발생하기전까진
                // ↓ 0~4 사이의 정수 중, Random한 값을 뽑아내기 위함
                int randomItem = (int) (Math.random() * MAX_ITEM);

                // restock : 재고를 넣는 메서드
                appleStore.restock(itemList[randomItem]);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException ignored) {
                }
            }
        };

        // 고객
        Runnable Customer = () -> {
            while (true) {
                try {
                    Thread.sleep(77);
                } catch (InterruptedException ignored) {
                }

                int randomItem = (int) (Math.random() * MAX_ITEM);

                //sale : 판매하는 메서드
                appleStore.sale(itemList[randomItem]);
                System.out.println(Thread.currentThread().getName() + " Purchase Item " + itemList[randomItem]);
            }
        };


        new Thread(StoreClerk, "StoreClerk").start();
        new Thread(Customer, "Customer1").start();
        new Thread(Customer, "Customer2").start();

    }
}

class AppleStore {
    private List<String> inventory = new ArrayList<>();

    public void restock(String item) {
        synchronized (this) {
            while (inventory.size() >= Main.MAX_ITEM) {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                try {
                    wait(); // 재고가 꽉 차있어서 재입고하지 않고 기다리는 중!
                    Thread.sleep(333);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // 재입고
            inventory.add(item);
            notify(); // 재입고 되었음을 고객에게 알려주기
            System.out.println("Inventory 현황: " + inventory.toString());
        }
    }

    public synchronized void sale(String itemName) {
        while (inventory.size() == 0) {
            System.out.println(Thread.currentThread().getName() + " Waiting!");
            try {
                wait(); // 재고가 없기 때문에 고객 대기중
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (true) {
            // 고객이 주문한 제품이 있는지 확인
            for (int i = 0; i < inventory.size(); i++) {
                if (itemName.equals(inventory.get(i))) {
                    inventory.remove(itemName);
                    notify(); // 제품 하나 팔렸으니 재입고 하라고 알려주기
                    return; // 메서드 종료
                }
            }

            // 고객이 찾는 제품이 없을 경우
            try {
                System.out.println(Thread.currentThread().getName() + " Waiting!");
                wait();
                Thread.sleep(333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}