package Week03.HW.HWCalculatorSimpleFolder;

public class Calculator_Simple {
    public double calculate (String operator, int firstNum, int secondNum) {
        double answer = 0;

        if (operator.equals("+")) {
            //더하기 연산
            answer = firstNum + secondNum;
        } else if (operator.equals("-")) {
            //빼기 연산
            answer = firstNum - secondNum;
        } else if (operator.equals("*")) {
            //곱하기 연산
            answer = firstNum * secondNum;
        } else if (operator.equals("/")) {
            //나누기 연산
            answer = firstNum / secondNum;
        } else if (operator.equals("%")) {
            //나머지 연산
            answer = firstNum % secondNum;
        }

        return answer;
    }
}
