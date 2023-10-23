package THIS_Kiosk_Single_Project_THIS;

import java.util.ArrayList;
import java.util.List;

public class Kiosk {

    private int selectCategory;
    private List<Product> burgerList = new ArrayList<>();
    private List<Product> drinkList = new ArrayList<>();
    private List<Menu> menuList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();

    public Kiosk() {
        burgerList.add(new Product("피핀네 머슈룸 버거", 400, "빵, 패티, 야채, 버섯"));
        burgerList.add(new Product("레골라스네 램버스 버거", 2800, "빵, 야채"));
        burgerList.add(new Product("라다가스트네 헤롱헤롱 버거", 15, "빵, 버섯"));

        drinkList.add(new Product("청룡 맥주", 170, "샤이어 특제밀로 주조하고 강한 치즈향이 특징!"));
        drinkList.add(new Product("곤도르의 하얀 맥주", 340, "곤도르왕국 특산주로 하얗고 깔끔한게 특징!"));
        drinkList.add(new Product("모리아 수염 맥주", 485, "드워프만의 비밀 제조법으로 만듬, 강한 목넘김이 특징!"));

        menuList.add(new Menu("각종 햄버거", "각 주인공들의 특색이 담긴 버거들"));
        menuList.add(new Menu("시원한 생맥주", "각 지역별 특색이 담긴 맥주들"));

        orderList.add(new Order("선택하신 + menu + 를 장바구니에 담을까요? 1. 담기   2. 취소"));


//        orderList.add(new MenuExpension())

    }

//    public void MainInfo() {
//        System.out.println(Kiosk.;
//    }

    public void show() {
        System.out.println("1. 각종 햄버거");
        System.out.println("2. 시원한 생맥주");
        System.out.println("3. 장바구니 확인하기");
        System.out.println("원하시는 메뉴를 선택해주세요!");

//        if (selectNum == 1) {
//            for (int i = 0; i < menuList.size(); i++) {
//            }
//            ;
//        }
    }

    public void selectCategory(int customerSelectNumber) {
        this.selectCategory = customerSelectNumber;
    }

    public void showSelectCategory() {
        if (selectCategory == 1) {
            System.out.println("맛있는 햄버거 메뉴입니다.");
            for (int i = 0; i < burgerList.size(); i++) {
                burgerList.get(i);
                System.out.print((i + 1) + ". ");
                System.out.println(burgerList.get(i).getName() + " | " + burgerList.get(i).getprice() + " | " + burgerList.get(i).getDescription());

            }
        } else if (selectCategory == 2) {
            System.out.println("시원한 생맥주 메뉴입니다.");
            for (int i = 0; i < drinkList.size(); i++) {
                drinkList.get(i);
                System.out.print((i + 1) + ". ");
                System.out.println(drinkList.get(i).getName() + " | " + drinkList.get(i).getprice() + " | " + drinkList.get(i).getDescription());

//            int x = 0;
//            for (Product p : drinkList) {
//                System.out.print(x);
//                System.out.println(p.getName() + p.getprice() + p.getDescription());
//                x = x + 1;
            }
        } else if (selectCategory == 3) {
            System.out.println("장바구니 담긴 메뉴는 총 " + " 개 입니다.");
        } else {
            System.out.println("잘못누르셨습니다. 다시 선택해주세요.");
        }
    }


    public void printBurgerInfo() {
//        System.out.println(Kiosk(int ID, String name, ));
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

    public List<Order> getOrderList() {
        return orderList;
    }
}