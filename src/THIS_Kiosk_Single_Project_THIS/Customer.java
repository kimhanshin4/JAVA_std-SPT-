package THIS_Kiosk_Single_Project_THIS;

import Practice.Kiosk.Kiosk;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.show();

        Scanner sc = new Scanner(System.in);
        int selectNum = 0;
        selectNum = Integer.parseInt(sc.nextLine());

        kiosk.selectCategory(selectNum);
        kiosk.showSelectCategory();

    }


}