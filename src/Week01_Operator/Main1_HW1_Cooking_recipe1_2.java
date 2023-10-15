package Week01_Operator;

import java.util.Scanner;

public class Main1_HW1_Cooking_recipe1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        float rate = sc.nextFloat();
        String clear = sc.nextLine();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        String input4 = sc.nextLine();
        String input5 = sc.nextLine();
        String input6 = sc.nextLine();
        String input7 = sc.nextLine();
        String input8 = sc.nextLine();
        String input9 = sc.nextLine();
        String input10 = sc.nextLine();
        String input11 = sc.nextLine();
        String input12 = sc.nextLine();
        String input13 = sc.nextLine();
        String input14 = sc.nextLine();
        String input15 = sc.nextLine();

        title = "♡" + title + "♡";

        int intRate = (int)rate;
        double percent = intRate * 100 / 5;
        System.out.println(title);
        System.out.println("별점 : " + intRate + " (" + percent + "%)");
        System.out.println("1." + input1);
        System.out.println("2." + input2);
        System.out.println("3." + input3);
        System.out.println("4." + input4);
        System.out.println("5." + input5);
        System.out.println("6." + input6);
        System.out.println("7." + input7);
        System.out.println("8." + input8);
        System.out.println("9." + input9);
        System.out.println("10." + input10);
        System.out.println("11." + input11);
        System.out.println("12." + input12);
        System.out.println("13." + input13);
        System.out.println("14." + input14);
        System.out.println("15." + input15);

    }
}