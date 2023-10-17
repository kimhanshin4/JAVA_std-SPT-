package Week04.HW.CalculatorFolder;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]"; //입력값이 연산자임을 확인하기 위한 정규식
    private static final String NUMBER_REG = "^[0-9]*$"; //입력값이 정수임을 확인하기 위한 정규식

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws Exception { //(매개변수)throws Exception 추가

        //Patter.matches : 입력값과 정규식이 맞는지 확인
        if (!Pattern.matches(NUMBER_REG, firstInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setFirstNumber(Integer.parseInt(firstInput)); //입력값(문자열)의 인트로의 형변환
        return this; //위 문장의 this로 인해 변경된 인스턴스 값을 반환하기 위한 작성
    }

    public Parser parseSecondNum(String secondInput) throws Exception { //(매개변수)throws Exception 추가
        //Patter.matches : 입력값과 정규식이 맞는지 확인
        if (!Pattern.matches(NUMBER_REG, secondInput)) {
            throw new BadInputException("정수값");
        }
        this.calculator.setSecondNumber(Integer.parseInt(secondInput)); //입력값(문자열)의 인트로의 형변환
        return this; //위 문장의 this로 인해 변경된 인스턴스 값을 반환하기 위한 작성
    }


    public Parser parseOperator(String operationInput) throws Exception {//(매개변수)throws Exception 추가

        //Patter.matches : 입력값과 정규식이 맞는지 확인
        if (!Pattern.matches(OPERATION_REG, operationInput)) {
            throw new BadInputException("사칙 연산의 연산자");
        }
        switch (operationInput) { //입력되는 사칙연산 별로 연산자를 달리 주기 위한 switch문
            case "+":
                this.calculator.setOperation(new AddOper());
                break;
            case "-":
                this.calculator.setOperation(new SubOper());
                break;
            case "*":
                this.calculator.setOperation(new MulOper());
                break;
            case "/":
                this.calculator.setOperation(new DivOper());
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}