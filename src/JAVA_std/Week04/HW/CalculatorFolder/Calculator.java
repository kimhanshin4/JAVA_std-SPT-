package JAVA_std.Week04.HW.CalculatorFolder;


public class Calculator {
    private int firstNumber;
    private int secondNumber;

    private AbsOper operation;

    public Calculator(AbsOper operation) {
        this.operation = operation;
    }

    public Calculator() {
    }

    public void setOperation(AbsOper operation) {
        this.operation = operation;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(this.firstNumber, this.secondNumber);
        return answer;
    }

}