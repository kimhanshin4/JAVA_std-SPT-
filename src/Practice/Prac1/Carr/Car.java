package Practice.Prac1.Carr;

public class Car {
    String company;
    String model;
    String color;
    double price;
    double speed;
    char gear;
    boolean lights;
    public Car () {

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
