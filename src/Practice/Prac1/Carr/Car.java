package Practice.Prac1.Carr;

public class Car {
    //<필드>
    //1) 고유 데이터 영역
    String company;
    String model;
    String color;
    double price;

    //2) 상태 데이터 영역
    double speed;
    char gear;
    boolean lights;

    //3) 객체 데이터 영역
    Tire tire;
    Door door;
    Handle handle;

    //<생성자>
    public Car () {
        System.out.println("객체가 생성됨!");
    }

    //gasPedal
    //input : kmh
    //output : speed
    double gasPedal(double kmh) {
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
    boolean onOffLight () {
        lights = !lights;
        return lights;
    }

    //horn
    //input : x
    //output : x
    void horn () {
        System.out.println("뛰ㅣㅣㅣ");
    }
}
