package Week04.HW.CalculatorFolder;

public class SubOper extends AbsOper {
    @Override
    public double operate(int firstNumber,int secondNumber) {
        return firstNumber - secondNumber;
    };
//    public double operate (int firstNum, int secondNum) {
//        return firstNum - secondNum;
//    }
}