package Week03.HW.HWCalculatorFolder;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOper()
        );
        System.out.println(calculator.calculate(10,29));
        calculator.setOperation(new MulOper());
        System.out.println(calculator.calculate(10,29));

    }
}