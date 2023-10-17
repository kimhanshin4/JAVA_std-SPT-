package Week03.CalculatorFolder;


public class Calculator {

    private AbsOper operation;
    public Calculator (AbsOper operation) {
        this.operation = operation;
    }

    public void setOperation (AbsOper operation) {
        this.operation = operation;
    }
    public double calculate (int firstNum, int secondNum) {
        double answer = 0;

        answer = operation.operate(firstNum,secondNum);
//        if (operator.equals("+")) {
//            //더하기 연산
//            answer = addOperation.operate(firstNum,secondNum);
//        } else if (operator.equals("-")) {
//            //빼기 연산
//            answer = subtractOperation.operate(firstNum,secondNum);;
//        } else if (operator.equals("*")) {
//            //곱하기 연산
//            answer = multiplyOperation.operate(firstNum,secondNum);
//        } else if (operator.equals("/")) {
//            //나누기 연산
//            answer = divideOperation.operate(firstNum,secondNum);
//        } else if (operator.equals("%")) {
//            //나머지 연산
//            answer = firstNum % secondNum;
//        }

        return answer;
    }
}
