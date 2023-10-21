package TEST.aKiosk;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Menu> menuList = Arrays.asList(
                new Menu(1, "피핀네 머슈룸 버거", 400, "골드", "빵, 패티, 야채, 버섯"),
                new Menu(2, "레골라스네 램버스 버거", 2800, "골드", "빵, 야채"),
                new Menu(3, "라다가스트네 헤롱헤롱 버거", 15, "골드", "빵, 버섯")
        );

        List<Order> orderSelect = Arrays.asList(
                new Order("빌보네 버거집에 오신 걸 환영합니다♬" + System.lineSeparator() + "1.주문하기  2.주문확인"),
                new Order("위 메뉴를 장바구니에 담으시겠습니까?" + System.lineSeparator() + "1.담기  2.취소"),
                new Order("장바구니를 확인 후 주문합니다" + System.lineSeparator() + "1.확인  2.취소"),
                new Order("아래와 같이 주문 하시겠습니까?" + System.lineSeparator() + "1.주문  2.취소")
        );

        int selectNum;
        int selectNum2;
        int selectNum3;
        int selectNum4;

        Scanner sc = new Scanner(System.in);
        selectNum = Integer.parseInt(sc.nextLine());

        boolean trigger = false;

        while (!trigger) {
            if (selectNum == 1) {

                for (int i = 0; i < menuList.size(); i++) {
                    menuList.get(i).printMenuInfo();
                }
            } else if (selectNum == 0) {

            }
            break;
        }



    }
}

