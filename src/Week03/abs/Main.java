package Week03.abs;

public class Main {
    public static void main(String[] args) {
        Car car1 = new BenzCar();
        car1.horn();
        System.out.println();

        Car car2 = new AudiCar();
        car2.horn();
        System.out.println();

        Car car3 = new ZenesisCar();
        car3.horn();
    }
}