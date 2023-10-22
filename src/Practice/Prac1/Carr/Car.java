package Practice.Prac1.Carr;

public class Car {
    //<필드>
    //1) 고유 데이터 영역
    String company;
    String model = "Lamborguini";
    String color;
    double price;

    //2) 상태 데이터 영역
    double speed;
    char gear;
    boolean lights = true;

    //3) 객체 데이터 영역
    Tire tire = new Tire(); //하위 클래스 Tire를 가져와 변수 tire에 할당 => 인스턴스화 => 사용가능
    Door door;
    Handle handle;

    //<생성자>
    public Car () {
        System.out.println("객체가 생성됨!");
    }

    //gasPedal
    //input : kmh
    //output : speed
    double gasPedal(double kmh, char type) {
        changeGear(type); // 내부 메서드 호출!
        speed = kmh;
        return speed;
    }

    //breakPedal
    //input : x
    //output : speed
    double breakPedal () {
        speed = 0;
        return speed;
    }

    //changeGear
    //input : gear char
    //output : gear
    char changeGear (char type) {
        gear = type;
        return gear;
    }

    //onOffLight
    //input : x
    //output : lights boolean
    boolean onOffLights () {
        lights = !lights;
        return lights;
    }

    //horn
    //input : x
    //output : x
    void horn () {
        System.out.println("뛰ㅣㅣㅣ");
    }

    //자동차의 속도 ... 가변길이 메서드
    void carSpeeds(double ... speeds) {
        for (double v : speeds) {
            System.out.println("v = " + v);
        }
    }
}
