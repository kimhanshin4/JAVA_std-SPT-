package Prac.CalculatorFol;

public class Calculator {
    private final AddOper addOperation;
    private final SubOper subOperation;
    private final MulOper mulOperation;
    private final DivOper divOperation;

    public Calculator (AddOper addOperation,
                      SubOper subOperation,
                      MulOper mulOperation,
                      DivOper divOperation) {
        this.addOperation = addOperation;
        this.subOperation = subOperation;
        this.mulOperation = mulOperation;
        this.divOperation = divOperation;
    }

    //입력은 정수로 받지만, 나누기 소수점을 위해 double
    public double calculate(String oper, int fstNum, int secNum) {
        double answer = 0;

        if (oper.equals("+")) {
            answer = addOperation.operate(fstNum, secNum);
        } else if (oper.equals("-")) {
            answer = subOperation.operate(fstNum, secNum);
        } else if (oper.equals("*")) {
            answer = mulOperation.operate(fstNum, secNum);
        } else if (oper.equals("/")) {
            answer = divOperation.operate(fstNum, secNum);
        } else if (oper.equals("%")) {
            answer = fstNum % secNum;
        }
        return answer;
    }
}