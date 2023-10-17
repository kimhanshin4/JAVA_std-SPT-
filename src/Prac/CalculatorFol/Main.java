package Prac.CalculatorFol;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator(
                new AddOper(),
                new SubOper(),
                new MulOper(),
                new DivOper()
        );
        System.out.println(cal.calculate("+",10,29));
        System.out.println(cal.calculate("*",10,29));
        System.out.println(cal.calculate("%",10,29));
    }
}
