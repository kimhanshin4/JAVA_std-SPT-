package JAVA_std.Week03.poly;

public class Car {
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    Tire getHankookTire() {
        return new HankookTire("HANKOOK");
    }

    Tire getKiaTire() {
        return new KiaTire("KIA");
    }
}