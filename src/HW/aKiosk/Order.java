package HW.aKiosk;

import java.util.ArrayList;

public class Order {
    private String orderSelection;

        public Order(String orderSelection) {
        this.orderSelection = orderSelection;
    }

    public String getOrderSelection() {
        return orderSelection;
    }

    public void printOrderInfo() {
        System.out.println("장바구니에 담으시겠습니까?");
        System.out.print("1. 담기");
        System.out.print("  ");
        System.out.print("2. 취소");
    }
}
