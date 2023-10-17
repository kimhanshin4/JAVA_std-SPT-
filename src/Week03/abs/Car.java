package Week03.abs;

public abstract class Car {
    double speed; // 자동차 속도, kmh
    public double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    public double brakePedal() {
        speed = 0;
        return speed;
    }

    public abstract void horn ();
}