package Week03;

//1. 설계도(클래스) 선언
//2. 객체가 가져야 할 속성(필드) 정의
//3. 객채의 생성 방식 정의 (생성자 constructor)
//4. 객체가 가져야 할 행위(메서드) 정의
public class Car { // 클래스 자체를 정의하는 것이기 때문에 Main 메서드를 제외한다.
    //<필드영역>
    String company; //자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색
    double price; // 자동차 가격
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태(P, R, N, D)
    boolean lights; // 자동차 조명 상태

    //<생성자 영역>
    // 생성자 = class 이름과 동일하게 가져간다. : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행할지, 어떤 값이 필수로 들어와야 하는지 정의
    //input, logic, 어떠한 것도 없다.
    public Car () {
        //기본생성자 : 생략이 가능
    }

//<메서드 영역>
}
