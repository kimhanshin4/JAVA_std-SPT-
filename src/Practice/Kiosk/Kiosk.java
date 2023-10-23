package Practice.Kiosk;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {
    private int selectCategory;
    private List<Product> burgerList = new ArrayList<>();
    private List<Product> drinkList = new ArrayList<>();
    private List<Menu> menuList = new ArrayList<>();
    private List<Menu> orderList = new ArrayList<>();

    public Kiosk() {
        burgerList.add(new Product(1, "피핀네 머슈룸 버거", 400, "빵, 패티, 야채, 버섯"));
        burgerList.add(new Product(2, "레골라스네 램버스 버거", 2800, "빵, 야채"));
        burgerList.add(new Product(3, "라다가스트네 헤롱헤롱 버거", 15, "빵, 버섯"));

        drinkList.add(new Product(1, "청룡 맥주", 170, "샤이어 특제밀로 주조하고 강한 치즈향이 특징!"));
        drinkList.add(new Product(1, "곤도르의 하얀 맥주", 170, "곤도르왕국 특산주로 하얗고 깔끔한게 특징!"));
        drinkList.add(new Product(1, "모리아 수염 맥주", 170, "드워프만의 비밀 제조법으로 만듬, 강한 목넘김이 특징!"));

        menuList.add(new Menu(1, "각종 햄버거", "각 주인공들의 특색이 담긴 버거들"));
        menuList.add(new Menu(2, "시원한 생맥주", "각 지역별 특색이 담긴 맥주들"));

        orderList.add(new Menu(3,))

    }

//    public void MainInfo() {
//        System.out.println(Kiosk.;
//    }

    public void show() {
        System.out.println("1. 각종 햄버거");
        System.out.println("2. 시원한 생맥주");
        System.out.println("원하시는 메뉴를 선택해주세요!");

//        if (selectNum == 1) {
//            for (int i = 0; i < menuList.size(); i++) {
//            }
//            ;
//        }
    }

    public void selectCategory(int customerSeletNumber) {
        this.selectCategory = customerSeletNumber;
    }

    public void showSelectCategory() {
        if (selectCategory == 1) {
            for (int i = 0; i < menuList.size(); i++) {
                burgerList.get(i);
                System.out.println("4.장바구니확인하기  5.주문취소");
            }
        } else if (selectCategory == 2 ) {
            for (int i = 0; i < menuList.size(); i++) {
                drinkList.get(i);
                System.out.println("4.장바구니확인하기  5.주문취소");
            }
        } else {

        }
    }

    public void printBurgerList() {
        for (int i = 0; i < menuList.size(); i++) {
            burgerList.get(i);
            System.out.println("4.장바구니확인하기  5.주문취소");
        }
    }

    public void printBurgerInfo() {
        System.out.println(Kiosk( int ID, String name, ));
    }

    public List<Product> getBurgerList() {
        return burgerList;
    }

    public List<Product> getDrinkList() {
        return drinkList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
}