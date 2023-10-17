package JAVA_std.Week03;

//1. 설계도(클래스) 선언
//2. 객체가 가져야 할 속성(필드) 정의
//3. 객채의 생성 방식 정의 (생성자 constructor)
//4. 객체가 가져야 할 행위(메서드) 정의

// 이를 이용해 객체화를 할 수 있음.
// public접근제어자 덕분에 다른 파일에서도 불러올 수 있다.
public class Car { // 클래스 자체를 정의하는 것이기 때문에 Main 메서드를 제외한다.
    //<필드영역>

    // 1) 고유 데이터
    String company; //자동차 회사
    String model = "Sesto Elemento"; // 자동차 모델
    String color; // 자동차 색

    // 2) 상태 데이터
    double price; // 자동차 가격
    double speed; // 자동차 속도, km/h
    char gear; // 기어상태(P, R, N, D)
    boolean lights = true; // 자동차 조명 상태

    // 3) 개체 데이터
    Tire tire = new Tire();
    Door door;
    Handle handle;

    //<생성자 영역>
    // 생성자 = class 이름과 동일하게 가져간다. : 처음 객체가 생성될 때(instance화) 어떤 로직을 수행할지, 어떤 값이 필수로 들어와야 하는지 정의
    //input, logic, 어떠한 것도 없다.
    public Car() {
        //기본생성자 : 생략 가능

        System.out.println("진짜 생성자 호출 됨? 객체 가즈아!");
    }

    //<메서드 영역>

    // 객체 메서드로서의 기능을 익혀보자
    // gasPedal
    // input : kmh
    // output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // "가속도 페달을 밟으면 자동으로 기어가 변한다."
        speed = kmh;
        return speed;
    }

    // brakePedal
    // input : x
    // output : speed
    double brakePedal() {
        speed = 0;
        return speed;
    }

    // changeGear
    // input : gear(char type)
    // output: gear
    char changeGear(char type) {
        gear = type;
        return gear;
    }

    // onOffLight
    // input : x
    // output : lights(boolean)
    boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    // horn
    // input : x
    // output : x
    void horn() { //input 도 output도 없다. => void
        System.out.println("뛷뛷!");
    }

    // 자동차의 속도. 가변길이 활용 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
