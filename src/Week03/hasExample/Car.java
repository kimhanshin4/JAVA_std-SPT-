package Week03.hasExample;

public class Car {

    static final String company = "GENESIS"; // 자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    double speed;  // 자동차 속도 , km/h
    char gear = 'P'; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    Tire[] tire;
    Door[] door;
    Handle handle;

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void setTire(Tire ... tire) {
        this.tire = tire;
    }

    public void setDoor(Door ... door) {
        this.door = door;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public double gasPedal(double kmh, char type) {
        changeGear(type);
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public char changeGear(char type) {
        gear = type;
        return gear;
    }

    public boolean onOffLights() {
        lights = !lights;
        return lights;
    }

    public void horn() {
        System.out.println("빵빵");
    }
}